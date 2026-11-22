// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-22 19:04:40
// Runtime:    1 ms (beats 100.00%)
// Memory:     76.6 MB (beats 80.29%)
// Topics:     Array, Divide and Conquer, Dynamic Programming

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i= 1; i<nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
