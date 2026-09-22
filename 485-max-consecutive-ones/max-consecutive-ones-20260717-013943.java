// 485. Max Consecutive Ones
// https://leetcode.com/problems/max-consecutive-ones/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-17 01:39:43
// Runtime:    2 ms (beats 98.26%)
// Memory:     52.3 MB (beats 92.06%)
// Topics:     Array

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int n = nums.length;

        int maxi = 0;
        int count = 0;

        for(int i = 0; i<n; i++){
            if(nums[i] == 1){
                count++;
            }else if(nums[i] == 0){
                maxi = Math.max(maxi, count);
                count = 0;
            }
        }

        maxi = Math.max(maxi, count);

        return maxi;
    }
}
