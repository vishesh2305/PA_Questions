// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-28 12:51:38
// Runtime:    1 ms (beats 100.00%)
// Memory:     76.8 MB (beats 53.19%)
// Topics:     Array, Divide and Conquer, Dynamic Programming

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int curSum = nums[0];
        int MaxSum = nums[0];

        for(int i =1; i<n; i++){
            curSum = Math.max(curSum+nums[i], nums[i]);
            MaxSum = Math.max(MaxSum, curSum);
        }

        return MaxSum;
    }
}
