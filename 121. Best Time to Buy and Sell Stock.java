/* 
Problem: 121. Best Time to Buy and Sell Stock. 
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

Approach: Iterate prices array and track minprice so far, and update maxprofit at each step.

TC: O(n) Iteration of the  prices array.
SC: O(1) Constant extra spaces used.
*/
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
