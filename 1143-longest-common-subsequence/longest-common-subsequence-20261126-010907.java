// 1143. Longest Common Subsequence
// https://leetcode.com/problems/longest-common-subsequence/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-26 01:09:07
// Runtime:    2534 ms (beats 5.18%)
// Memory:     56.6 MB (beats 5.04%)
// Topics:     String, Dynamic Programming, Longest Common Subsequence

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];

        for(int i=0; i<text1.length(); i++){
            Arrays.fill(dp[i], -1);
        }

        return solve(text1, text2, 0, 0, dp);
    }

    private int solve(String t1, String t2 , int i, int j , int[][] dp){
        if(i == t1.length() || j == t2.length()) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        if(t1.charAt(i) == t2.charAt(j)) return 1+solve(t1, t2, i+1, j+1, dp);

        dp[i][j] = Math.max(solve(t1, t2, i, j+1, dp), solve(t1, t2, i+1, j, dp));

        return dp[i][j];
    }
}
