// 342. Power of Four
// https://leetcode.com/problems/power-of-four/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-15 02:56:02
// Runtime:    1 ms (beats 90.01%)
// Memory:     42.5 MB (beats 51.77%)
// Topics:     Math, Bit Manipulation, Recursion

class Solution {
    public boolean isPowerOfFour(int n) {

        if(n==1) return true;

        if(n%4 !=0 || n <=0) return false;

        return isPowerOfFour(n/4);
        
    }
}
