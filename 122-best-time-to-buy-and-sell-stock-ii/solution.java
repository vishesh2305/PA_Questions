// 122. Best Time to Buy and Sell Stock II
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-08-06 15:00:15
// Runtime:    0 ms (beats 100.00%)
// Memory:     46.3 MB (beats 83.17%)
// Topics:     Array, Dynamic Programming, Greedy

class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int totalProfit = 0;

        

        for(int i=1; i<n; i++){

            if(prices[i] > prices[i-1]){
                totalProfit += prices[i] - prices[i-1];
            }

        }

        return totalProfit;
        
    }
}
