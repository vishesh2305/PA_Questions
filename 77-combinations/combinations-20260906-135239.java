// 77. Combinations
// https://leetcode.com/problems/combinations/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-06 13:52:39
// Runtime:    18 ms (beats 76.76%)
// Memory:     98.1 MB (beats 28.41%)
// Topics:     Backtracking

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        int[] numbers = new int[n];
        for (int i = 1; i <= n; i++) {
            numbers[i-1] = i;
        }

        helper(numbers, 0, k, new ArrayList<>());
        return result;

    }

    private void helper(int[] numbers, int index, int k, List<Integer> ds) {
        if (ds.size() == k) {
            result.add(new ArrayList<>(ds));
            return;
        }

        if (index == numbers.length) {
            return;
        }

        for (int i = index; i < numbers.length; i++) {
            ds.add(numbers[i]);
            helper(numbers, i+1, k, ds);
            ds.remove(ds.size()-1);
        }

    }
}
