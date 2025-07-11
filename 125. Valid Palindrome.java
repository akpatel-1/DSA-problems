/* 
Problem: 125. Valid Palindrome. 
Link: https://leetcode.com/problems/valid-palindrome/description/

Approach: Replace all non-alphanumeric character, reverse the string and check equals.

TC: O(n) Scanning and reversing the string.
SC: O(n) Storing cleaned and reversed strings.
*/
class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(cleaned).reverse();
        return cleaned.equals(reversed.toString());
    }
}
