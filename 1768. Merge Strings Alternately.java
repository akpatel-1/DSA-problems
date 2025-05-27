/*
Problem: 1768. Merge Strings Alternately
Link: https://leetcode.com/problems/merge-strings-alternately/description/
 
Approach: Create StringBuilder -> Store minLength between word1 & word2 -> iterate up to minLength and append both words alternately -> append larger word using conditional statement and return it.

TC: O(m + n) loop iterates at most O(min(n, m)) times.
SC: O(n + m) StringBuilder dynamically resizes, but still holds up to n + m characters.
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLength; i++) {
            merged.append(word1.charAt(i)).append(word2.charAt(i));
        }

        merged.append(word1.length() > word2.length() ? word1.substring(minLength) : word2.substring(minLength));
        return merged.toString();
    }
}


/* 🌟Learning
+ is used with String and .append() is used with StringBuilder
String mutable, StringBuilder immutable
String slower in loops, StringBuilder faster in loops
String everytime creates new object when change, StringBuilder modify the string
String s += "str.charAt(i)", StringBuilder sb.append(charAt(i))

🔹 StringBuilder()
Definition: Creates a mutable sequence of characters.
Syntax: StringBuilder sb = new StringBuilder();

🔹 .append(char or String)
Definition: Adds the given character or string to the end of the StringBuilder.
Syntax: sb.append('a'); or sb.append("text");

🔹 .charAt(int index)
Definition: Returns the character at the specified position in a string.
Syntax: char c = str.charAt(0);

🔹 .length()
Definition: Returns the number of characters in the string.
Syntax: int len = str.length();

🔹 Math.min(a, b)
Definition: Returns the smaller of two values.
Syntax: int min = Math.min(5, 10);

🔹 .substring(int start)
Definition: Returns a substring starting from the given index to the end.
Syntax: String sub = str.substring(3);

🔹 .toString()
Definition: Converts the StringBuilder into a regular String.
Syntax: String result = sb.toString();

✅ String.valueOf(obj) → Safe Object to String
Like .toString() but null-safe (returns "null" if object is null).
Object obj = null;
String s = String.valueOf(obj);  // "null", no crash

*/