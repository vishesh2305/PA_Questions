// 162. Find Peak Element
// https://leetcode.com/problems/find-peak-element/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-08-25 02:01:25
// Runtime:    0 ms (beats 100.00%)
// Memory:     44.2 MB (beats 38.56%)
// Topics:     Array, Binary Search

class Solution {
    public int findPeakElement(int[] nums) {

        return binarySearch(nums, 0, nums.length-1);
        
    }

    private int binarySearch(int[] nums, int left , int right){
        
        int mid = left + (right - left)/2;
        if(left >= right) return mid;


        if(nums[mid] < nums[mid+1]){
            return binarySearch(nums, mid+1, right);
        }else{
            return binarySearch(nums, left , mid);
        }

    }
}
