// 204. Count Primes
// https://leetcode.com/problems/count-primes/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-10-06 00:54:34
// Runtime:    724 ms (beats 44.55%)
// Memory:     80.1 MB (beats 12.51%)
// Topics:     Array, Math, Enumeration, Number Theory, Primality Test, Sieve Theory, Prime Number Sieve

class Solution {
    public int countPrimes(int n) {

        if(n==0 || n==1) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2; i*i < n; i++){
            if(isPrime[i]){
                for(int j=i*i ; j<n; j+= i){
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;

        for(int i=0; i<n; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;

    }
}
