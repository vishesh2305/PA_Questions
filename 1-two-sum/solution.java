// 1. Two Sum
// https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-20 12:45:54
// Runtime:    3 ms (beats 59.84%)
// Memory:     46.7 MB (beats 57.79%)
// Topics:     Array, Hash Table

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];

            if(map.containsKey(complement)){
                result[0] = i;
                result[1] = map.get(complement);
                return result;
            }
            map.put(nums[i], i);
        }

        return result;

    }
}
