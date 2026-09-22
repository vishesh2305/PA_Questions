// 216. Combination Sum III
// https://leetcode.com/problems/combination-sum-iii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-06 14:01:21
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.3 MB (beats 65.91%)
// Topics:     Array, Backtracking

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(n, k , 1, new ArrayList<>());
        return result;
    }

    private void helper(int n, int k, int index, List<Integer> ds) {
        if (ds.size() > k)
            return;

        if (ds.size() == k) {
            if (n == 0) {
                result.add(new ArrayList<>(ds));
            }
            return;
        }

        if (index > 9)
            return;

        if (n == 0)
            return;

        ds.add(index);
        helper(n - index, k, index + 1, ds);
        ds.remove(ds.size() - 1);
        helper(n, k, index + 1, ds);
    }
}
