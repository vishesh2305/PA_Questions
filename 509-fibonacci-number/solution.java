// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-10-05 23:54:28
// Runtime:    9 ms (beats 41.16%)
// Memory:     41.8 MB (beats 92.99%)
// Topics:     Math, Dynamic Programming, Recursion, Memoization

class Solution {
    public int fib(int n) {

        if(n<=1) return n;

        return fib(n-1)+fib(n-2);
        
    }
}
