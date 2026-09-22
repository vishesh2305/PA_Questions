// 40. Combination Sum II
// https://leetcode.com/problems/combination-sum-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-06 13:44:45
// Runtime:    6 ms (beats 69.89%)
// Memory:     45.4 MB (beats 38.59%)
// Topics:     Array, Backtracking

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        helper(candidates, 0, target, new ArrayList<>());
        return result;
    }

    private void helper(int[] candidates, int index,  int target, List<Integer> ds){
        if(target == 0){
            result.add(new ArrayList<>(ds));
            return;
        }
        if(index == candidates.length) return;

        for(int i= index; i<candidates.length; i++){
            if(i > index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            ds.add(candidates[i]);
            helper(candidates, i+1, target-candidates[i], ds);
            ds.remove(ds.size()-1);
        }

    }
}
