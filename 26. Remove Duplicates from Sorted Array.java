/* 
Problem: 26. Remove Duplicates from Sorted Array. 
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

Approach: Iterate through the array, if element not equal to previous unique element insert in array.

TC: O(n) Iternation throuch array.
SC: O(1) Constant extra space used.
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) 
                nums[i++] = nums[j];
        }
        return i;
    }
}
