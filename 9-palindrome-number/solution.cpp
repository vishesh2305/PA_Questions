// 9. Palindrome Number
// https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy
// Language:   C++
// Submitted:  2025-08-28 13:58:14
// Runtime:    0 ms (beats 100.00%)
// Memory:     8.5 MB (beats 91.79%)
// Topics:     Math

class Solution {
public:
    bool isPalindrome(int x) {

        if(x < 0){
            return false;
        }
            long long rev =0;
            int num = x;
            while(num != 0){
                rev = rev*10 + num % 10;
                num = num/10;
            };
            return (rev==x);
    }
};
