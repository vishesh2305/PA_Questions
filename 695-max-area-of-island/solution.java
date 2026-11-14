// 695. Max Area of Island
// https://leetcode.com/problems/max-area-of-island/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-14 19:59:31
// Runtime:    3 ms (beats 35.87%)
// Memory:     46.3 MB (beats 60.79%)
// Topics:     Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int MaxCount =0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                MaxCount = Math.max(MaxCount, helper(grid, i, j, visited));
            }
        }

        return MaxCount;

    }

    static private int helper(int[][] grid, int curRow, int curCol, boolean[][] visited){
        if(curRow < 0 || curCol < 0 || curRow >= grid.length || curCol >= grid[0].length){
            return 0;
        }
        if(visited[curRow][curCol] == true) return 0;
        if(grid[curRow][curCol] == 0) return 0;
        visited[curRow][curCol] = true;

        return (1+ helper(grid, curRow+1, curCol, visited) + helper(grid, curRow-1, curCol, visited) + helper(grid, curRow, curCol+1, visited)+helper(grid, curRow, curCol-1, visited));

    }
}
