// 35. Search Insert Position
// https://leetcode.com/problems/search-insert-position/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-19 01:22:04
// Runtime:    0 ms (beats 100.00%)
// Memory:     44.9 MB (beats 29.28%)
// Topics:     Array, Binary Search

class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
        return findindex(nums, 0, nums.length-1, target);        
    }

    private int findindex(int[] nums, int left, int right, int target){
        int mid = left + (right - left)/2;
        if(left > right){
            return mid;
        }
        if(target == nums[mid]){
            return mid;
        }else if(target < nums[mid]){
            return findindex(nums, left, mid-1, target);
        }else{
            return findindex(nums, mid+1, right, target);
        }
    }
}
