/* 
Problem: 27. Remove Element. 
Link: https://leetcode.com/problems/remove-element/description/

Approach: Iterate through the array if element not equal to value put in array.

TC: O(n) Iteration through array.
SC: O(1) Constant extra space.
*/
class Solution {
public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i++] = nums[j];
        }
    }
    return i;
}

}
