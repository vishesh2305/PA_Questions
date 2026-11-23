// 283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-23 09:15:07
// Runtime:    2 ms (beats 94.88%)
// Memory:     47.5 MB (beats 55.86%)
// Topics:     Array, Two Pointers

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0) return;

        int index = 0;

        for(int i : nums){
            if(i != 0){
                nums[index++] = i;
            }
        }

        while(index < nums.length){
            nums[index++] = 0;
        }
    }
}
