// 733. Flood Fill
// https://leetcode.com/problems/flood-fill/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-13 21:06:38
// Runtime:    1 ms (beats 68.78%)
// Memory:     46 MB (beats 97.89%)
// Topics:     Array, Depth-First Search, Breadth-First Search, Matrix

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc] == color) return image;
        fill(image, sr, sc, color, image[sr][sc]);

        return image;
    }

    private static void fill(int[][] image, int curRow, int curCol, int color, int curVal){
        if(curRow >= image.length || curRow < 0 || curCol >= image[0].length || curCol < 0){
            return;
        }

        if(image[curRow][curCol] != curVal){
            return;
        }else{
            image[curRow][curCol] = color;
            fill(image, curRow+1, curCol, color, curVal);
            fill(image, curRow-1, curCol, color, curVal);
            fill(image, curRow, curCol+1, color, curVal);
            fill(image, curRow, curCol-1, color, curVal);
        }
    }
}
