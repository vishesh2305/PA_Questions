// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-25 02:17:46
// Runtime:    9 ms (beats 41.80%)
// Memory:     42.4 MB (beats 5.15%)
// Topics:     Math, Dynamic Programming, Recursion, Memoization

class Solution {
    public int fib(int n) {

        if(n <= 1){
            return n;
        }

        return fib(n-1) + fib(n-2);
        
    }
}
