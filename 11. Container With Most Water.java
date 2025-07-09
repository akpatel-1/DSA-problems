/* 
Problem: 11. Container With Most Water. 
Link: https://leetcode.com/problems/container-with-most-water/description/

Approach: Using two pointer start and end. While start<end find minHeight & width, then calculate  and update maxWater.Also move the pointer with smaller height.

TC: O(n) Iteration through the array.
SC: O(1) Constant space used.
*/
class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1, maxWater = 0;
        while (start < end) {
            int minHeight = Math.min(height[start], height[end]);
            int width = end - start;
            maxWater = Math.max(maxWater, minHeight * width);
            
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;
    }
}
