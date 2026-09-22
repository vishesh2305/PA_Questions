// 75. Sort Colors
// https://leetcode.com/problems/sort-colors/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-02 12:16:33
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.6 MB (beats 39.82%)
// Topics:     Array, Two Pointers, Sorting, Quicksort, Bubble Sort

class Solution {
    public void sortColors(int[] nums) {

        int left =0;
        int mid =0;
        int right = nums.length - 1;


        

        while(mid <= right){
            if(nums[mid] == 0){
                int temp = nums[left];
                nums[left++] = nums[mid];
                nums[mid++] = temp;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[right];
                nums[right--] = nums[mid];
                nums[mid] = temp;
            }
        }
        
    }
}
