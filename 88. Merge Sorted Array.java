/* 
Problem: 88. Merge Sorted Array. 
Link: https://leetcode.com/problems/merge-sorted-array/description/

Approach: Start comparing both array from backward put bigger to the end of nums1 untill one ends. If nums2 has leftovers, copy them in nums1.

TC: O(m+n) Every elements of both the array visited once.
SC: O(1) All operation are done in-place.
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (m > 0 && n > 0) {
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
        }
        while (n > 0) {
            nums1[n - 1] = nums2[n - 1];
            n--;
        }
    }
}
