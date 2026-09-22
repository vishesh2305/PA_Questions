// 62. Unique Paths
// https://leetcode.com/problems/unique-paths/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-10 02:11:36
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.1 MB (beats 47.37%)
// Topics:     Math, Dynamic Programming, Combinatorics

class Solution {
    public int uniquePaths(int m, int n) {

        int[][] memo = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                memo[i][j] = -1;
            }
        }

        return helper(m,n,0,0,memo);
        
    }

    private int helper(int m, int n, int curRow, int curCol, int[][] memo){
        if(curRow > m-1 || curCol > n-1){
            return 0;
        };
        if(curRow==m-1 && curCol == n-1){
            return 1;
        }
        if(memo[curRow][curCol] != -1){
            return memo[curRow][curCol];
        }
        memo[curRow][curCol] = helper(m, n, curRow+1, curCol, memo) + helper(m, n, curRow, curCol+1, memo);
        return memo[curRow][curCol];
    }
}
