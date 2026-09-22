// 48. Rotate Image
// https://leetcode.com/problems/rotate-image/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-02 15:49:39
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.8 MB (beats 34.21%)
// Topics:     Array, Math, Matrix

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }}
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;}}
    }
}
