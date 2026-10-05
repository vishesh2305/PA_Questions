// 204. Count Primes
// https://leetcode.com/problems/count-primes/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-10-06 00:56:49
// Runtime:    621 ms (beats 72.96%)
// Memory:     79.8 MB (beats 38.62%)
// Topics:     Array, Math, Enumeration, Number Theory, Primality Test, Sieve Theory, Prime Number Sieve

class Solution {
    public int countPrimes(int n) {

        if(n==0 || n==1) return 0;
        boolean[] isPrime = new boolean[n];


        for(int i=2; i*i < n; i++){
            if(!isPrime[i]){
                for(int j=i*i ; j<n; j+= i){
                    isPrime[j] = true;
                }
            }
        }

        int count = 0;

        for(int i=2; i<n; i++){
            if(!isPrime[i]){
                count++;
            }
        }
        return count;

    }
}
