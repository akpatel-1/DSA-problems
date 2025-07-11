/* 
Problem: 169. Majority Element. 
Link: https://leetcode.com/problems/majority-element/description/

Approach: Solved using Boyer-Moore Voting Algorithm. Take a cadidate element if it appears again increment count it else decrement it. If count equals to 0 choose new candidate.

TC: O(n) Iterating through the array.
SC: O(1) Constant extra spaces.
*/
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
