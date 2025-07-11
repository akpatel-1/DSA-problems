/* 
Problem: 55. Jump Game. 
Link: https://leetcode.com/problems/jump-game/description/

Approach: Using greedy approah to track the farthest index we can reach. 
Iterate the array and update reach after each index. If index goes beyond reach, return false.

TC: O(n) — We iterate through the array once.
SC: O(1) — No extra space is used.
*/

class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > reach) return false; // If we can't reach this index
            reach = Math.max(reach, i + nums[i]); // Update the farthest reach
        }
        return true; // If loop finishes, we can reach the end
    }
}
