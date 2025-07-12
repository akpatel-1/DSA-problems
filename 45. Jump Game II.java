/* 
Problem: 45. Jump Game II. 
Link: https://leetcode.com/problems/jump-game-ii/description/

Approach: Solved using Greedy appraoch. Track fartest reachable index if 'i == currentEnd' means jump range exhausted, so jump++ and update the currentEnd.

TC: O(n) Iterating through the array.
SC: O(1) Constant extra spaces used.
*/
class Solution {
    public int jump(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;  
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]); 
            if (i == currentEnd) { 
                jumps++;
                currentEnd = farthest;
                if (currentEnd >= nums.length - 1) break; 
            }
        }   
        return jumps;
    }
}