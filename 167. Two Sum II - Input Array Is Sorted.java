/* 
Problem: 167. Two Sum II - Input Array Is Sorted. 
Link: https://leetcode.com/problems/two-sum-ii---input-array-is-sorted/description/

Approach: Use 2 pointer start and end. If sum of both indices equals to target return indices + 1 else adjust the indices.

TC: O(n) Iteration through the array.
SC: O(1) Constant space used.
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0 , end = numbers.length - 1;
        while(start<end){
            if(numbers[start] + numbers[end] == target){
            return new int[] {start+1, end+1};
            } else if(target < numbers[start]+numbers[end]){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}