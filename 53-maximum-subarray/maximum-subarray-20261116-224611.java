// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-16 22:46:11
// Runtime:    1 ms (beats 99.98%)
// Memory:     76.6 MB (beats 90.64%)
// Topics:     Array, Divide and Conquer, Dynamic Programming

class Solution {
    public int maxSubArray(int[] nums) {

        int MaxSum = nums[0];
        int currSum = MaxSum;


        for(int i=1; i<nums.length; i++){
            currSum = Math.max(nums[i] , currSum+nums[i]);
            MaxSum = Math.max(MaxSum, currSum);
        }

        return MaxSum;
    }
}
