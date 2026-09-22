// 204. Count Primes
// https://leetcode.com/problems/count-primes/
// Difficulty: Medium
// Language:   C++
// Submitted:  2026-01-06 13:38:19
// Runtime:    143 ms (beats 95.12%)
// Memory:     132.7 MB (beats 17.25%)
// Topics:     Array, Math, Enumeration, Number Theory, Primality Test, Sieve Theory, Prime Number Sieve

class Solution {
public:
    int countPrimes(int n) {
        if(n<=2) return 0;
        vector<int> isPrime(n, true);
        isPrime[0] = isPrime[1] = false;

        for(int i=2; i*i < n; i++){

            if(isPrime[i]){
                for(int j=2*i; j<n; j+=i){
                    isPrime[j] = false;
                }
            }

        };

        int count =0;
        for(int i=2; i<n; i++){
            if(isPrime[i]){
                count++;
            }
        };

        return count;

    }
};
