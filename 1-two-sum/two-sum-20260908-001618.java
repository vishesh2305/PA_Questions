// 1. Two Sum
// https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-09-08 00:16:18
// Runtime:    2 ms (beats 99.40%)
// Memory:     47 MB (beats 74.16%)
// Topics:     Array, Hash Table

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(arr.containsKey(complement)){
                return new int[] {arr.get(complement), i};
            }
            arr.put(nums[i], i);
        };

        return null;
    }
}
