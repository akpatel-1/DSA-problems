#!/bin/bash

# Stage all changes
git add .

# Get the list of added files (preserve spaces)
git diff --cached --name-only -z | while IFS= read -r -d '' file; do
  # Extract the filename without extension
  base_name=$(basename "$file")
  name_without_ext="${base_name%.*}"

  # Commit with custom message
  git commit -m "Added leetcode - $name_without_ext" -- "$file"
done
