// 560. Subarray Sum Equals K
// https://leetcode.com/problems/subarray-sum-equals-k/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-08-27 01:52:35
// Runtime:    24 ms (beats 75.41%)
// Memory:     48.2 MB (beats 96.35%)
// Topics:     Array, Hash Table, Prefix Sum

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count =0;

        map.put(0, 1);

        int CurrSum =0;


        for(int x : nums){
            CurrSum += x;

            int target =CurrSum - k;

            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(CurrSum, map.getOrDefault(CurrSum, 0)+1);
        }

        return count;
        
    }
}
