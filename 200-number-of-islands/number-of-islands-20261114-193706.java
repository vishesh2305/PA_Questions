// 200. Number of Islands
// https://leetcode.com/problems/number-of-islands/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-14 19:37:06
// Runtime:    3 ms (beats 90.48%)
// Memory:     52.1 MB (beats 44.80%)
// Topics:     Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix

class Solution {

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                count++;
                Check(grid, i, j);
                }
            }
        }

        return count;
    }

    static private void Check(char[][] grid, int curRow, int curCol){
        if(curRow <0 || curRow >= grid.length || curCol < 0 || curCol >= grid[0].length || grid[curRow][curCol] != '1'){
            return;
        }
        grid[curRow][curCol] = '0';
        Check(grid, curRow+1, curCol);
        Check(grid, curRow-1, curCol);
        Check(grid, curRow, curCol+1);
        Check(grid, curRow, curCol-1);
    }
}
