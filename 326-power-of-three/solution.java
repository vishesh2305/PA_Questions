// 326. Power of Three
// https://leetcode.com/problems/power-of-three/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-15 02:55:00
// Runtime:    8 ms (beats 92.39%)
// Memory:     46.1 MB (beats 45.35%)
// Topics:     Math, Recursion

class Solution {
    public boolean isPowerOfThree(int n) {

        if(n==1) return true;

        if(n%3 !=0 || n <= 0){
            return false;
            };

        return isPowerOfThree(n/3);
        
    }
}
