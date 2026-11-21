// 202. Happy Number
// https://leetcode.com/problems/happy-number/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-22 00:54:04
// Runtime:    1 ms (beats 88.92%)
// Memory:     41.9 MB (beats 73.81%)
// Topics:     Hash Table, Math, Two Pointers, Floyd's Cycle Finding Algorithm

class Solution {
    public boolean isHappy(int n) {
        long slow = n;

        long fast = getSum(n);

        while(fast != 1 && fast != slow){
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        }

        return fast == 1;
    }

    private long getSum(long n){
        long nextSum = 0;

        while(n > 0){
            long digit = n % 10;
            nextSum += digit*digit;
            n /= 10;
        }

        return nextSum;
    }
}
