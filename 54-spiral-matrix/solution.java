// 54. Spiral Matrix
// https://leetcode.com/problems/spiral-matrix/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-12 19:17:29
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.1 MB (beats 25.26%)
// Topics:     Array, Matrix, Simulation

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        

        int row = matrix.length;
        int col = matrix[0].length;

        List<Integer> result = new ArrayList<>();


        int left =0;
        int right = col-1;

        int top = 0;
        int bottom = row-1;

        while(left <= right && top <= bottom){

            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

        if(top <= bottom){
            for(int i=right; i>=left; i--){
                result.add(matrix[bottom][i]);
            };
            bottom--;
        }

        if(left <= right){

            for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            };
            left++;
        }
        }

        return result;




    }
}
