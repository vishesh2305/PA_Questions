// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-28 11:32:22
// Runtime:    1 ms (beats 99.94%)
// Memory:     94.3 MB (beats 35.96%)
// Topics:     Array, Dynamic Programming

class Solution {
    public int maxProfit(int[] nums) {

        int sellDay = Integer.MIN_VALUE;



        int MaxProfit = Integer.MIN_VALUE;

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] > sellDay){
                sellDay = nums[i];
            }
            MaxProfit = Math.max(MaxProfit, sellDay - nums[i]);
        }



        return MaxProfit;


    }
}
