// 200. Number of Islands
// https://leetcode.com/problems/number-of-islands/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-11 03:08:37
// Runtime:    2 ms (beats 99.90%)
// Memory:     52.1 MB (beats 67.00%)
// Topics:     Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix

class Solution {
    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int count =0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    helper(grid, i, j);
                }
            }
        }

        return count;
        
    }

    private void helper(char[][] grid, int curRow, int curCol){

        if(curRow < 0 || curCol < 0 || curRow >= grid.length || curCol >= grid[0].length || grid[curRow][curCol] != '1'){
            return;
            };

        grid[curRow][curCol] = '0';

        helper(grid, curRow+1, curCol);
        helper(grid, curRow-1, curCol);
        helper(grid, curRow, curCol+1);
        helper(grid, curRow, curCol-1);
    }
}
