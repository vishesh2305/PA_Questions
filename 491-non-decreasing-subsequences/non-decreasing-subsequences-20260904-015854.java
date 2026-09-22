// 491. Non-decreasing Subsequences
// https://leetcode.com/problems/non-decreasing-subsequences/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-04 01:58:54
// Runtime:    9 ms (beats 50.95%)
// Memory:     52.1 MB (beats 94.19%)
// Topics:     Array, Hash Table, Backtracking, Bit Manipulation

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        helper(nums, 0, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, int index, List<Integer> current){
        if(current.size() >= 2){
            result.add(new ArrayList<>(current));
        }

        if(index >= nums.length){
            return;
        }

        Set<Integer> seen = new HashSet<>();

        for(int i=index; i<nums.length; i++){
            if(seen.contains(nums[i]) || (!current.isEmpty() && nums[i] < current.get(current.size()-1))) continue;

            seen.add(nums[i]);

            current.add(nums[i]);
            helper(nums, i+1, current);
            current.remove(current.size()-1);
        }
    }
}
