// 1. Two Sum
// https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-23 09:18:51
// Runtime:    2 ms (beats 99.42%)
// Memory:     46.3 MB (beats 93.75%)
// Topics:     Array, Hash Table

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];

            if(map.containsKey(comp)){
                return new int[]{i, map.get(comp)};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
