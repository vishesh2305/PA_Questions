// 73. Set Matrix Zeroes
// https://leetcode.com/problems/set-matrix-zeroes/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-06-28 00:05:53
// Runtime:    0 ms (beats 100.00%)
// Memory:     47.5 MB (beats 79.61%)
// Topics:     Array, Hash Table, Matrix

class Solution {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;

        boolean firstRow = false;
        boolean firstCol = false;

        int col = matrix[0].length;


        for(int i=0; i<col; i++){
            if(matrix[0][i] == 0){
                firstRow =true;
            }
        }

        for(int j=0; j<row; j++){
            if(matrix[j][0] == 0){
                firstCol =true;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){

                if(matrix[i][j] == 0){
                    matrix[i][0] =0;
                    matrix[0][j] =0;
                }
            }
        }

        for(int i=1; i<row; i++){
            if(matrix[i][0] == 0){
                for(int j=0; j<col; j++){
                    matrix[i][j] =0;
                }
            }
        }

        for(int j=1; j<col; j++){
            if(matrix[0][j] == 0){
                for(int i =0 ; i<row; i++){
                    matrix[i][j] =0;
                }
            }
        }

        if(firstRow){
            for(int j=0; j<col; j++){
                matrix[0][j] =0;
            }
        }

                if(firstCol){
            for(int j=0; j<row; j++){
                matrix[j][0] =0;
            }
        }
        
    }
}
