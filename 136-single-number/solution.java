// 136. Single Number
// https://leetcode.com/problems/single-number/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-20 11:14:08
// Runtime:    1 ms (beats 99.95%)
// Memory:     46.3 MB (beats 90.19%)
// Topics:     Array, Bit Manipulation

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for(int i : nums){
            ans ^= i;
        }

        return ans;
    }
}
