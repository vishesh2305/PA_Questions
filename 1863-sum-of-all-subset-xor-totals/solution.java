// 1863. Sum of All Subset XOR Totals
// https://leetcode.com/problems/sum-of-all-subset-xor-totals/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-09-02 01:09:05
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.6 MB (beats 59.58%)
// Topics:     Array, Math, Backtracking, Bit Manipulation, Combinatorics, Enumeration

class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int index, int currentXor){
        if(index >= nums.length){
            return currentXor;
        }

        int pick = helper(nums, index+1, currentXor ^ nums[index]);
        int drop = helper(nums, index+1, currentXor);

        return pick + drop;
    }
}
