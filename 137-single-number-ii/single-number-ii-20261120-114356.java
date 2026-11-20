// 137. Single Number II
// https://leetcode.com/problems/single-number-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-20 11:43:56
// Runtime:    2 ms (beats 76.83%)
// Memory:     45.9 MB (beats 30.54%)
// Topics:     Array, Bit Manipulation

class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;

        for(int i : nums){
            ones = (ones ^ i) & ~twos;
            twos = (twos ^ i) & ~ones;
        }

        return ones;
    }
}
