// 2461. Maximum Sum of Distinct Subarrays With Length K
// https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-08 02:45:40
// Runtime:    34 ms (beats 82.25%)
// Memory:     98.5 MB (beats 80.95%)
// Topics:     Array, Hash Table, Sliding Window

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int left =0;

        long max =0;
        long curr =0;

        Set<Integer> set = new HashSet<>();

        for(int right =0; right < nums.length; right++){
            while(set.contains(nums[right])){
                curr -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            curr+= nums[right];
            set.add(nums[right]);


            if((right - left + 1) == k){
                max = Math.max(curr, max);
                curr-= nums[left];
                set.remove(nums[left]);
                left++;
            }

        }

        return max;
        
    }
}
