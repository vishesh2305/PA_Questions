// 1752. Check if Array Is Sorted and Rotated
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-10 18:04:57
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.2 MB (beats 12.33%)
// Topics:     Array

class Solution {
    public boolean check(int[] nums) {

        int count =0;

        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }
        }

        return count<=1;
        
    }
}
