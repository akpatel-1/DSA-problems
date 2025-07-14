/* 
Problem: 238. Product of Array Except Self
Link: https://leetcode.com/problems/product-of-array-except-self/description/

Approach: 
Use Prefix and Suffix Product Method.
- Create an answer array and initialize with 1 at index 0.
- First loop: Fill answer[] with prefix products.
- Second loop (from end): Multiply answer[i] with suffix product and update suffix.
- Return the answer array.

Time Complexity: O(n) – two passes over array.
Space Complexity: O(1) – ignoring output array.
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Compute prefix products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        // Step 2: Compute suffix product on the fly
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }

        return answer;
    }
}
