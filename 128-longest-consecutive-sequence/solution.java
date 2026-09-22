// 128. Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-11 00:55:02
// Runtime:    22 ms (beats 88.52%)
// Memory:     77.7 MB (beats 84.70%)
// Topics:     Array, Hash Table, Union-Find

class Solution {
    public int longestConsecutive(int[] nums) {

        int n= nums.length;
        int count =1;
        int max_len =1;

        if(n < 2) return n;

        Arrays.sort(nums);

        for(int i=0; i<n-1;i++){

            if(nums[i] == nums[i+1]-1){
                count++;
                max_len = Math.max(max_len, count);
            }else if(nums[i] == nums[i+1]){
                continue;
            }else {
                count = 1;
            }
        }
        return max_len;
        
    }
}
