// 643. Maximum Average Subarray I
// https://leetcode.com/problems/maximum-average-subarray-i/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-21 01:49:01
// Runtime:    5 ms (beats 32.32%)
// Memory:     69.5 MB (beats 79.57%)
// Topics:     Array, Sliding Window

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n= nums.length;

        if(k > n) return 0.0;

        double sum =0;

        for(int i=0; i<k; i++){
            sum+= nums[i];
        }


        double max_sum = sum;
        int left = 1;
        int right = k;

        while(right < n){
            sum -= nums[left-1];
            sum += nums[right];

            max_sum = Math.max(sum, max_sum);
            left++;
            right++;
        }

        return max_sum/k;

    }
}
