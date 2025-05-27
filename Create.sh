
#!/bin/bash

# Prompt for filename
read -p "Enter filename: " fname

# Extract problem number and problem title
problem_number=$(echo "$fname" | grep -o "^[0-9]*")
problem_title=$(echo "$fname" | sed "s/^$problem_number//;s/^[. ]//")

# Create slug from the problem title for the URL
slug=$(echo "$problem_title" | tr '[:upper:]' '[:lower:]' | tr ' ' '-' | sed 's/^-//' | sed 's/-$//')

# Keep the original filename and add .java extension
file="${fname}.java"
link="https://leetcode.com/problems/${slug}/description/"

# Create the file with multi-line comment block format
cat <<EOF > "$file"
/* 
Problem: $problem_number.$problem_title. 
Link: $link

Approach:

TC:
SC:
*/
EOF

# Open the file in VS Code
code "$file"

echo "Created file: $file"