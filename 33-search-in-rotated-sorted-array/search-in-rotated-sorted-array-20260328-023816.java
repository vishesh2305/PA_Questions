// 33. Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-03-28 02:38:16
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.4 MB (beats 95.92%)
// Topics:     Array, Binary Search

class Solution {
    public int search(int[] nums, int target) {

        int n= nums.length;

        int left =0;
        int right = n - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target) return mid;

            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && nums[mid] >= target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(nums[right] >= target && nums[mid] <=target){
                    left= mid+1;
                }else{
                    right = mid-1;
                }
            }

        }

        return -1;
        
    }
}
