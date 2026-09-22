// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-06 14:30:09
// Runtime:    1 ms (beats 99.94%)
// Memory:     94.2 MB (beats 84.98%)
// Topics:     Array, Dynamic Programming

class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int MaxProfit=0;

        int sell = Integer.MIN_VALUE;

        for(int i=n-1; i>=0; i--){
            if(prices[i]>sell){
                sell = prices[i];
            }
            MaxProfit = Math.max(MaxProfit, sell - prices[i]);
        }
        return MaxProfit;
    }
}
