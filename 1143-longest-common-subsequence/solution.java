// 1143. Longest Common Subsequence
// https://leetcode.com/problems/longest-common-subsequence/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-26 00:45:02
// Runtime:    50 ms (beats 5.10%)
// Memory:     56.4 MB (beats 5.04%)
// Topics:     String, Dynamic Programming, Longest Common Subsequence

class Solution {
    private int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        dp = new int[m][n];

        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }

        return solve(text1, text2, 0, 0);
    }
    
    private int solve(String text1, String text2, int i , int j){
        if(i >= text1.length()) return 0;
        if(j >= text2.length()) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int ans = 0;

        if(text1.charAt(i) == text2.charAt(j)){
            ans = 1+solve(text1, text2, i+1, j+1);
        }else{
            ans = Math.max(solve(text1, text2, i, j+1), solve(text1, text2, i+1, j));
        }

        dp[i][j] = ans;

        return ans;
    }
}
