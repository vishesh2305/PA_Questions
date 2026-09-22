// 50. Pow(x, n)
// https://leetcode.com/problems/powx-n/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-08-15 02:26:52
// Runtime:    0 ms (beats 100.00%)
// Memory:     47.6 MB (beats 77.16%)
// Topics:     Math, Recursion

class Solution {
    public double myPow(double x, int n) {

        long N = n;

        if(N < 0){
            N=-N;
            x=1/x;
        }


        return power(x, N);
    }

    private double power(double x, long N){
        if(N==0){
            return 1;
        }
        double r= power(x, N/2);

        if(N%2==0){
            return r*r;
        }

        return x*r*r;
    }
}
