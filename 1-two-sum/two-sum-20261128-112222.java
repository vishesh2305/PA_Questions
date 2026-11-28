// 1. Two Sum
// https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-28 11:22:22
// Runtime:    2 ms (beats 99.42%)
// Memory:     47 MB (beats 29.05%)
// Topics:     Array, Hash Table

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                res[0] = i;
                res[1] = map.get(comp);
                return res;
            }
            map.put(nums[i], i);
        }
    return res;
    }
}
