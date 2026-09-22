// 733. Flood Fill
// https://leetcode.com/problems/flood-fill/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-09-10 03:08:51
// Runtime:    0 ms (beats 100.00%)
// Memory:     46.8 MB (beats 61.45%)
// Topics:     Array, Depth-First Search, Breadth-First Search, Matrix

class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        newImage(color, image, image[sr][sc], sr, sc);

        return image;

    }

    private void newImage(int color, int[][] image,int changeval,  int curRow, int curCol){

        if(curRow >= image.length || curCol >= image[0].length || curRow < 0 || curCol < 0){
            return;
        }

        if(image[curRow][curCol] == color || image[curRow][curCol] != changeval){
            return;
        }else{
            image[curRow][curCol] = color;
            newImage(color, image, changeval, curRow+1, curCol);
            newImage(color, image, changeval, curRow, curCol+1);
            newImage(color, image, changeval, curRow-1, curCol);
            newImage(color, image, changeval, curRow, curCol-1);
        }



    }
}
