#!/bin/bash

# Stage all changes
git add .

# Get the list of added files
files=$(git diff --cached --name-only)

for file in $files; do
  # Extract the filename without extension
  base_name=$(basename "$file")
  name_without_ext="${base_name%.*}"

  # Commit with custom message
  git commit -m "Added leetcode - $name_without_ext" -- "$file"
done
