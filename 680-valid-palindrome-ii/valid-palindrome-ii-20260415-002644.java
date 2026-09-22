// 680. Valid Palindrome II
// https://leetcode.com/problems/valid-palindrome-ii/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-15 00:26:44
// Runtime:    8 ms (beats 5.75%)
// Memory:     47.6 MB (beats 84.76%)
// Topics:     Two Pointers, String, Greedy

class Solution {
    public boolean validPalindrome(String s) {

        int n= s.length();

        if(n <= 1) return true;

        int l = 0;
        int r = n-1;

        while(l < r){
            char c1 = s.charAt(l);
            char c2 = s.charAt(r);

            if(c1 != c2){
                return isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1);
            }
            l++;
            r--;

        }
        return true;
        
    }

    private boolean isPalindrome(String s, int left, int right){
        while(left < right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            if(c1 != c2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
