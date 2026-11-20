// 560. Subarray Sum Equals K
// https://leetcode.com/problems/subarray-sum-equals-k/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-18 19:37:43
// Runtime:    24 ms (beats 83.64%)
// Memory:     48.2 MB (beats 76.41%)
// Topics:     Array, Hash Table, Prefix Sum

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count =0;
        map.put(0, 1);

        int currSum = 0;

        for(int i : nums){
            currSum += i;
            int target = currSum - k;

            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }

        return count;
    }
}
