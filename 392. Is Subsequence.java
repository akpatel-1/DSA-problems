/* 
Problem: 392. Is Subsequence. 
Link: https://leetcode.com/problems/is-subsequence/description/

Approach: Iterate through string t and check if characters of s appear in order.
If s.charAt(count) matches t.charAt(i), increment count.
If count reaches s.length(), it means s is a subsequence of t.

TC: O(n) Iterating through the string.
SC: O(1) Constant extra space used.
*/
class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        for(int i=0; i<t.length() && count<s.length(); i++){
            if(s.charAt(count)==t.charAt(i)) count++;
        }
        return count==s.length();
    }
}