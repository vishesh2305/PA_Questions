// 209. Minimum Size Subarray Sum
// https://leetcode.com/problems/minimum-size-subarray-sum/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-22 20:15:33
// Runtime:    1 ms (beats 99.80%)
// Memory:     54.5 MB (beats 99.95%)
// Topics:     Array, Binary Search, Sliding Window, Prefix Sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;

        int left =0;


        int curr_sum =0;
        int Min_Len =Integer.MAX_VALUE;

        for(int right =0; right < n ; right++){
            curr_sum += nums[right];

            while(curr_sum >= target){
                Min_Len = Math.min(Min_Len, right-left+1);
                curr_sum -= nums[left];
                left++;
            }
        }

        System.gc();

        if(Min_Len == Integer.MAX_VALUE) return 0;

        return Min_Len;
        
    }
}
