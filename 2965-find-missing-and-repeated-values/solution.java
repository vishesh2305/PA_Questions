// 2965. Find Missing and Repeated Values
// https://leetcode.com/problems/find-missing-and-repeated-values/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-05-18 18:43:22
// Runtime:    6 ms (beats 26.07%)
// Memory:     47.6 MB (beats 12.08%)
// Topics:     Array, Hash Table, Math, Matrix

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int[] result = new int[2];

        int n = grid.length;
        int m = grid[0].length;

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += grid[i][j];

                if (set.contains(grid[i][j])) {
                    result[0] = grid[i][j];
                }

                set.add(grid[i][j]);

            }
        }

        int nsq = n * n;
        int actual_sum = nsq * (nsq + 1) / 2;
        int missingDigit =  result[0] + (actual_sum - sum);

        result[1] = missingDigit;

        return result;

    }
}
