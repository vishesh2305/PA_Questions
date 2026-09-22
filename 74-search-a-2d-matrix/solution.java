// 74. Search a 2D Matrix
// https://leetcode.com/problems/search-a-2d-matrix/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-05 02:33:36
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.7 MB (beats 90.40%)
// Topics:     Array, Binary Search, Matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int col = matrix[0].length-1;
        int row = -1;


        int top =0;

        int bottom = matrix.length-1;

        while(top <= bottom){
            int mid = top + (bottom - top)/2;

            if(matrix[mid][0] > target){
                bottom = mid-1;
            }else if(matrix[mid][col] < target){
                top = mid+1;
            }else if(matrix[mid][0] <= target && matrix[mid][col] >= target){
                row = mid;
                break;
            }
        }

        if(row == -1) return false;

        int left =0;
        int right = col;


        while(left <= right){
        int mid = left + (right - left)/2;
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return false;

        
    }
}
