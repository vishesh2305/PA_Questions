// 695. Max Area of Island
// https://leetcode.com/problems/max-area-of-island/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-22 02:01:18
// Runtime:    2 ms (beats 63.24%)
// Memory:     46.8 MB (beats 22.37%)
// Topics:     Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix

class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int MaxCount =0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j] == true) continue;
                MaxCount = Math.max(MaxCount, helper(grid, visited, i, j));
            }
        }

        return MaxCount;
        
    }

    private int helper(int[][] grid, boolean[][] visited, int currRow, int currCol){
        if(currRow < 0 || currRow >= grid.length || currCol < 0 || currCol >= grid[0].length) return 0;
        if(grid[currRow][currCol] == 0) return 0;

        if(visited[currRow][currCol] == true){
            return 0;
        }


        visited[currRow][currCol] = true;
        return (1 + helper(grid, visited, currRow, currCol+1)+
        helper(grid, visited, currRow, currCol-1)+
        helper(grid, visited, currRow+1, currCol)+
        helper(grid, visited, currRow-1, currCol)); 

    }
}
