#!/bin/bash

# Prompt for file name
read -p "Enter the file name to add (or '.' to add all): " file

# Get current branch name
branch=$(git rev-parse --abbrev-ref HEAD)

# Function to get filename without extension
get_name_without_ext() {
    basename "$1" | sed 's/\.[^.]*$//'
}

if [ "$file" == "." ]; then
    git add .

    # Get list of staged files, using NUL as delimiter
    git diff --cached --name-only -z | while IFS= read -r -d '' f; do
        name_without_ext=$(get_name_without_ext "$f")
        git commit -m "Added leetcode - $name_without_ext" -- "$f"
    done
else
    if [ -f "$file" ] || git ls-files --error-unmatch "$file" > /dev/null 2>&1; then
        git add "$file"
        name_without_ext=$(get_name_without_ext "$file")
        git commit -m "Added leetcode - $name_without_ext" -- "$file"
    else
        echo "File '$file' does not exist or is not tracked by Git."
        exit 1
    fi
fi

# Push to current branch 
git push origin "$branch"
