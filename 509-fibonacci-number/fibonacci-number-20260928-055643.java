// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-09-28 05:56:43
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.3 MB (beats 16.16%)
// Topics:     Math, Dynamic Programming, Recursion, Memoization

class Solution {
    public int fib(int n) {

        int a = 1;
        int b=0;

        while(n-->0){
            int temp = a;
            a = b;
            b= temp+a;
        }

        return b;
        
    }
}
