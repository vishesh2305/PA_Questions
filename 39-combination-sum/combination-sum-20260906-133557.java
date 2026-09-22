// 39. Combination Sum
// https://leetcode.com/problems/combination-sum/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-06 13:35:57
// Runtime:    2 ms (beats 94.08%)
// Memory:     45.1 MB (beats 98.82%)
// Topics:     Array, Backtracking

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void helper(int[] candidates, int target, int index, List<Integer> ds){
        if(index == candidates.length){
            if(target==0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }

        if(candidates[index] <= target){
            ds.add(candidates[index]);
            helper(candidates, target - candidates[index], index, ds);
            ds.remove(ds.size()-1);
        }
        helper(candidates, target, index+1, ds);
    }
}
