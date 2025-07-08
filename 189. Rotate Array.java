/* 
Problem: 189. Rotate Array. 
Link: https://leetcode.com/problems/rotate-array/description/

Approach: Reversing entire array then reverse first k elements then reverse remaining n-k elements.

TC: O(n) Used for reversal.
SC: (1) Few variables are used.
*/
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length; 
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}