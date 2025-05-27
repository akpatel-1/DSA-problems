#!/bin/bash

# Stage all changes
git add .

# Commit each file with a message like "Added leetcode - <filename>"
git diff --cached --name-only -z | while IFS= read -r -d '' file; do
  base_name=$(basename "$file")
  name_without_ext="${base_name%.*}"

  git commit -m "Added leetcode - $name_without_ext" -- "$file"
done

# Push to the remote repository
git push
