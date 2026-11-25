// 516. Longest Palindromic Subsequence
// https://leetcode.com/problems/longest-palindromic-subsequence/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-26 01:13:32
// Runtime:    48 ms (beats 46.42%)
// Memory:     63.8 MB (beats 37.07%)
// Topics:     String, Dynamic Programming

class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];

        for(int[] i : dp){
            Arrays.fill(i, -1);
        }

        StringBuilder sb = new StringBuilder(s);

        String s_rev = sb.reverse().toString();

        return solve(s, s_rev, 0, 0, dp);

    }

    private int solve(String s1, String s2, int i, int j, int[][] dp){
        if(i == s1.length() || j == s2.length()) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            return 1+solve(s1, s2, i+1, j+1, dp);
        }

        dp[i][j] = Math.max(solve(s1, s2, i, j+1, dp), solve(s1, s2, i+1, j, dp));

        return dp[i][j];

    }
}
