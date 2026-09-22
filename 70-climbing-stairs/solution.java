// 70. Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-25 02:44:04
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.2 MB (beats 36.21%)
// Topics:     Math, Dynamic Programming, Memoization

class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;

        int[] memo = new int[n+1];

        return helper(n, memo);
    }

    private int helper(int n,  int[] memo){

        if(n<= 2) return n;
        if(memo[n] > 0) return memo[n];

        memo[n] = helper(n-1, memo) + helper(n-2, memo);

        return memo[n];

    }
}
