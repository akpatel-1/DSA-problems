/* 
Problem: 14. Longest Common Prefix
Link: https://leetcode.com/problems/longest-common-prefix/description/

Approach: Initialize a StringBuilder with the first string.
Loop through the array and find the common prefix between current prefix and each string.
Use min length to avoid index out of bounds.
If characters match, increment j; otherwise stop and trim prefix.

TC: O(n * m) : n = number of strings, m = length of the shortest string. 
               O(m) + O(m) + O(m) + ... (n - 1) times = O((n - 1) * m) = O(n * m)

SC: O(1) : Constand string buider with decreasing or constant size.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder(strs[0]);
        for(int i=1; i<strs.length; i++){
            int minLength=Math.min(commonPrefix.length(), strs[i].length());
            int j=0;
            while(j < minLength && commonPrefix.charAt(j) == strs[i].charAt(j)) j++;
            commonPrefix.setLength(j);
            if (commonPrefix.length() == 0) return "";
        }
        return commonPrefix.toString();
    }
}