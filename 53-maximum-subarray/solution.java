// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-08-27 01:23:33
// Runtime:    1 ms (beats 99.93%)
// Memory:     77.3 MB (beats 33.02%)
// Topics:     Array, Divide and Conquer, Dynamic Programming

class Solution {
    public int maxSubArray(int[] nums) {

        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = Integer.MIN_VALUE;

        for(int x : nums){
            if(CurrSum <= 0){
                CurrSum = x;
            }else{
                CurrSum += x;
            }
            MaxSum = Math.max(CurrSum, MaxSum);
        }
        return MaxSum;
        
    }
}
