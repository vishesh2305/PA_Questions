// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-16 23:45:37
// Runtime:    1 ms (beats 99.98%)
// Memory:     76.5 MB (beats 89.42%)
// Topics:     Array, Divide and Conquer, Dynamic Programming

class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];

        int MaxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            curSum = Math.max(nums[i], curSum+nums[i]);

            MaxSum = Math.max(MaxSum, curSum);
        }
        return MaxSum;
    }
}
