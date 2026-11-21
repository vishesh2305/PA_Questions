// 202. Happy Number
// https://leetcode.com/problems/happy-number/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-22 00:38:56
// Runtime:    2 ms (beats 31.60%)
// Memory:     42.3 MB (beats 36.71%)
// Topics:     Hash Table, Math, Two Pointers, Floyd's Cycle Finding Algorithm

class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;

        long num = n;

        Set<Integer> set = new HashSet<>();

        while(num != 1){
            if(set.contains((int)num)){
                return false;
            }

            int temp = (int)num;
            set.add((int)num);
            num = 0;

            while(temp > 0){
                int digit = temp%10;
                num += digit*digit;
                temp /= 10;
            }

        }

        return true;

    }
}
