// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-09-28 05:58:08
// Runtime:    9 ms (beats 41.58%)
// Memory:     41.9 MB (beats 84.79%)
// Topics:     Math, Dynamic Programming, Recursion, Memoization

class Solution {
    public int fib(int n) {

        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
        
    }
}
