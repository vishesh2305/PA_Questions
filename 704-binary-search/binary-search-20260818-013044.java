// 704. Binary Search
// https://leetcode.com/problems/binary-search/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-18 01:30:44
// Runtime:    0 ms (beats 100.00%)
// Memory:     48.1 MB (beats 84.49%)
// Topics:     Array, Binary Search

class Solution {
    public int search(int[] nums, int target) {
        return recursive_call(nums, 0, nums.length-1, target);
    }

    private int recursive_call(int[] nums, int left, int right, int target){
        int mid = left + (right - left)/2;

        if(left > right) return -1;
        
        if(nums[mid] == target){
            return mid;
        }

        if(nums[mid] < target){
            return recursive_call(nums, mid+1, right , target);
        }else if (nums[mid] > target){
            return recursive_call(nums, left, mid-1, target);
        }

        return -1;
    }
}
