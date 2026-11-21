// 202. Happy Number
// https://leetcode.com/problems/happy-number/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-22 00:38:11
// Runtime:    2 ms (beats 31.60%)
// Memory:     42.1 MB (beats 56.05%)
// Topics:     Hash Table, Math, Two Pointers, Floyd's Cycle Finding Algorithm

class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;

        long num = n;

        Set<Long> set = new HashSet<>();

        while(num != 1){
            if(set.contains(num)){
                return false;
            }

            set.add(num);
            long temp = num;
            long nextSum = 0;

            while(temp > 0){
                long digit = temp%10;
                nextSum += digit*digit;
                temp /= 10;
            }
            num = nextSum;

        }

        return true;

    }
}
