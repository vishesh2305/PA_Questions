// 80. Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-15 04:15:50
// Runtime:    0 ms (beats 100.00%)
// Memory:     48.7 MB (beats 51.21%)
// Topics:     Array, Two Pointers

class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        if(n <=2) return n;

        int k= 2;

        for(int i=2; i<n; i++){
            if(nums[i] != nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
        
    }
}
