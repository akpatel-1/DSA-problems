/* 
Problem: 80. Remove Duplicates from Sorted Array II. 
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

Approach: Track reapeat count of each element (using 'candidate' & 'repeat'). If an element appers<=2 place it at next available position in the array using count.

TC: O(n) One pass through the array of length n.
SC: O(1) Constant space (uses few variables).
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int candidate = nums[0], repeat=1, count=1;
        for(int i=1; i<nums.length; i++){
            repeat = (candidate==nums[i])? repeat+1:1;
            if(repeat<=2){
                nums[count++]=nums[i];
                candidate = nums[i]; 
            }
        }
        return count;
    }
}

//More optimal
public int removeDuplicates(int[] nums) {
    if (nums.length <= 2) return nums.length;
    int count = 2;
    for (int i = 2; i < nums.length; i++) {
        if (nums[i] != nums[count - 2]) {
            nums[count++] = nums[i];
        }
    }
    return count;
}
