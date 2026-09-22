// 46. Permutations
// https://leetcode.com/problems/permutations/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-09 20:39:23
// Runtime:    1 ms (beats 87.88%)
// Memory:     45.3 MB (beats 78.73%)
// Topics:     Array, Backtracking

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        helper(nums, 0, used, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, int index, boolean[] used, List<Integer> ds){
        if(ds.size()==nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;

            ds.add(nums[i]);
            used[i] = true;
            helper(nums, i+1, used, ds);
            ds.remove(ds.size()-1);
            used[i] = false;
        };
    }
}
