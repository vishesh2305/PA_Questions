// 7. Reverse Integer
// https://leetcode.com/problems/reverse-integer/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-12 00:14:36
// Runtime:    1 ms (beats 99.96%)
// Memory:     42.6 MB (beats 63.52%)
// Topics:     Math

class Solution {
    public int reverse(int x) {

        int new_int = 0;


        if(x < 10 && x > -10) return x;


        while(x != 0){
            int digit = x % 10;
            x = x/10;
            if(new_int > Integer.MAX_VALUE/10 || new_int < Integer.MIN_VALUE /10) return 0;
            new_int = (new_int * 10) + digit;
        };

        return new_int;

    }
}
