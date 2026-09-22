// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-16 01:53:17
// Runtime:    0 ms (beats 100.00%)
// Memory:     46.6 MB (beats 62.69%)
// Topics:     Array, Two Pointers

class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        int left =0;


        for(int right = 0; right < n; right++){
            if(nums[left] != nums[right]){
                nums[++left] = nums[right];
            }
        }

        return left+1;
        
        
    }
}
