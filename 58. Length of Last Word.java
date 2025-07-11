/* 
Problem: 58. Length of Last Word. 
Link: https://leetcode.com/problems/length-of-last-word/description/

Approach: Trim the string to remove trailing spaces.
Iterate through the string; reset count to 0 on space, otherwise increment count.

TC: O(n) – iterate through the string once.
SC: O(1) – constant extra space.
*/
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            count = (s.charAt(i) == ' ') ? 0 : count + 1;
        }
        return count;
    }
}
