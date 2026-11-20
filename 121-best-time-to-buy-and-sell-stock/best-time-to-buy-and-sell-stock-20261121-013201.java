// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-21 01:32:01
// Runtime:    1 ms (beats 99.94%)
// Memory:     93.8 MB (beats 89.71%)
// Topics:     Array, Dynamic Programming

class Solution {
    public int maxProfit(int[] prices) {
        
        int MaxProfit = 0;

        int sellDay = Integer.MIN_VALUE;

        for(int i = prices.length - 1; i >= 0; i--){
            if(prices[i] > sellDay){
                sellDay = prices[i];
            }

            MaxProfit = Math.max(MaxProfit, sellDay - prices[i]);
        }

        return MaxProfit;

    }
}
