/* 
Problem: 274. H-Index. 
Link: https://leetcode.com/problems/h-index/description/

Approach: Sort the citations array in ascending order. Then, for each paper at index i, check if it has at least n - i citations. The first time this condition is met, return n - i as the H-Index. If no such index is found, return 0.

TC: O(n log n) – due to sorting
SC: O(1) – no extra space used other than variables
*/
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
}
