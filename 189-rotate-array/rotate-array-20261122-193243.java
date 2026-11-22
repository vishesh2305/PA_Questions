// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-22 19:32:43
// Runtime:    5 ms (beats 72.57%)
// Memory:     268.3 MB (beats 71.78%)
// Topics:     Array, Math, Two Pointers

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k%n;
        reverse(nums,0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k, nums.length - 1);
    }

    private void reverse(int[] nums,int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}
