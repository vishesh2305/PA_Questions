// 1137. N-th Tribonacci Number
// https://leetcode.com/problems/n-th-tribonacci-number/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-26 00:21:38
// Runtime:    0 ms (beats 100.00%)
// Memory:     41.8 MB (beats 84.78%)
// Topics:     Math, Dynamic Programming, Memoization

class Solution {
    public int tribonacci(int n) {

        int[] memo = new int[n+1];

        return helper(memo, n);
        
    }

    private int helper(int[] memo , int n){
        if(n == 0) return 0;

        if(n == 1 || n == 2) return 1;

        if(memo[n] > 0) return memo[n];

        memo[n] = helper(memo, n-1) + helper(memo , n-2) + helper(memo, n-3);

        return memo[n];
    }
}
