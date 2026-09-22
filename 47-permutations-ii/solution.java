// 47. Permutations II
// https://leetcode.com/problems/permutations-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-06 12:20:14
// Runtime:    3 ms (beats 93.19%)
// Memory:     46.7 MB (beats 42.28%)
// Topics:     Array, Backtracking, Sorting

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        helper(nums, used, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, boolean[] used, List<Integer> ds){
        if(ds.size()== nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i] || (i > 0 && !used[i-1] && nums[i] == nums[i-1])) continue;

            ds.add(nums[i]);
            used[i] = true;
            helper(nums, used, ds);
            ds.remove(ds.size()-1);
            used[i] = false;
        }
    }
}
