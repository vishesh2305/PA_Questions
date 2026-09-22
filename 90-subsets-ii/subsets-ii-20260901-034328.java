// 90. Subsets II
// https://leetcode.com/problems/subsets-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-01 03:43:28
// Runtime:    12 ms (beats 5.11%)
// Memory:     45 MB (beats 59.94%)
// Topics:     Array, Backtracking, Bit Manipulation

class Solution {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        helper(nums, 0, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, int index, List<Integer> current){
        if(index >= nums.length){
            if(!result.contains(current)){
            result.add(new ArrayList<>(current));
            }
            return;
        }
        current.add(nums[index]);
        helper(nums, index+1, current);
        current.remove(current.size()-1);
        helper(nums, index+1, current);
    }
}
