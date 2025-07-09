/* 
Leetcode 122 - Best Time to Buy and Sell Stock II
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

Idea: Buy and sell every time there's a profit and sum all profits.

Time: O(n) Iteration through the prices array.
Space: O(1) Constant extra space used.
*/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i-1] < prices[i]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}
