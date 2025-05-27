/*
Problem: 2239. Find Closest Number to Zero
Link: https://leetcode.com/problems/find-closest-number-to-zero/description/
 
Approach: Initialize closest=nums[0] -> loop num:nums -> check if(Math.abs(num)<Math.abs(closest) || Math.abs(num)==Math.abs(closest) && num>closest) -> return closest
 
TC: O(n) single loop
SC: O(1) primitive data used
 */

class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for(int num:nums){
            if(Math.abs(num)<Math.abs(closest) || Math.abs(num)==Math.abs(closest) && num>closest){
                closest = num;
            }
        }
        return closest;
    }
} 