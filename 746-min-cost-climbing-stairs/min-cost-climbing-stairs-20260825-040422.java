// 746. Min Cost Climbing Stairs
// https://leetcode.com/problems/min-cost-climbing-stairs/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-25 04:04:22
// Runtime:    1 ms (beats 40.12%)
// Memory:     44.9 MB (beats 58.97%)
// Topics:     Array, Dynamic Programming

class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int[] memo = new int[n];

        for(int i=0; i<n; i++){
            memo[i] = -1;
        }

        return Math.min(minCost(cost, memo, 0), minCost(cost, memo , 1));
        
    }

    private int minCost(int[] cost, int[] memo, int index){
        if(index >= cost.length) return 0;

        if(memo[index] != -1) return memo[index];

        memo[index] = cost[index] + Math.min(minCost(cost, memo, index+1), minCost(cost, memo, index+2));

        return memo[index];
    }
}
