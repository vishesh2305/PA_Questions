// 33. Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-22 18:05:58
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.1 MB (beats 94.60%)
// Topics:     Array, Binary Search

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target) return mid;

            if(nums[left] <=nums[mid]){
                if(nums[left] <= target && nums[mid] > target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(nums[right] >= target && nums[mid] < target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }

        return -1;
    }
}
