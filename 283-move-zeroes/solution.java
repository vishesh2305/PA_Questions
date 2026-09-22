// 283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-09 01:40:30
// Runtime:    1 ms (beats 99.89%)
// Memory:     47.9 MB (beats 20.34%)
// Topics:     Array, Two Pointers

class Solution {
    public void moveZeroes(int[] nums) {

        int n= nums.length;

        int i=0;

        for(int num : nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }

        while(i < n){
            nums[i] = 0;
            i++;
        }
        
    }
}
