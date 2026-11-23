// 560. Subarray Sum Equals K
// https://leetcode.com/problems/subarray-sum-equals-k/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-23 09:29:26
// Runtime:    26 ms (beats 39.27%)
// Memory:     48.1 MB (beats 80.65%)
// Topics:     Array, Hash Table, Prefix Sum

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int count =0;
        int currSum = 0;

        for(int i : nums){
            currSum += i;

            int target = currSum - k;

            if(map.containsKey(target)){
                count += map.get(target);
            }

            map.put(currSum, map.getOrDefault(currSum , 0) + 1);
        }

        return count;
    }
}
