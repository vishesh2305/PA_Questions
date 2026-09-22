// 78. Subsets
// https://leetcode.com/problems/subsets/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-09 20:07:15
// Runtime:    1 ms (beats 87.20%)
// Memory:     44.2 MB (beats 57.32%)
// Topics:     Array, Backtracking, Bit Manipulation

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<>());

        return result;
    }

    private void helper(int[] nums, int index, List<Integer> ds){
        if(index == nums.length){
            result.add(new ArrayList<>(ds));
            return;
        };

            ds.add(nums[index]);
            helper(nums, index+1, ds);
            ds.remove(ds.size()-1);
            helper(nums, index+1, ds);
    }
}
