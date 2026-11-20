// 231. Power of Two
// https://leetcode.com/problems/power-of-two/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-15 02:51:05
// Runtime:    1 ms (beats 98.49%)
// Memory:     42.6 MB (beats 26.61%)
// Topics:     Math, Bit Manipulation, Recursion

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n%2 !=0 || n==0){
            return false;
        }

        return isPowerOfTwo(n/2); 
        
    }

}
