// 733. Flood Fill
// https://leetcode.com/problems/flood-fill/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-14 11:04:11
// Runtime:    1 ms (beats 69.49%)
// Memory:     46.2 MB (beats 84.34%)
// Topics:     Array, Depth-First Search, Breadth-First Search, Matrix

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;

        fill(image, sr, sc, color, image[sr][sc]);

        return image;

    }

    private static void fill(int[][] image, int curRow, int curCol, int color, int originalColor){
        if(curRow < 0 || curCol < 0 || curRow >= image.length || curCol >= image[0].length){
            return;
        }

        if(image[curRow][curCol] != originalColor){
            return;
        }else{
            image[curRow][curCol] = color;
            fill(image, curRow+1, curCol, color, originalColor);
            fill(image, curRow-1, curCol, color, originalColor);
            fill(image, curRow, curCol+1, color, originalColor);
            fill(image, curRow, curCol-1, color, originalColor);
        }
    }
}
