// 5. Longest Palindromic Substring
// https://leetcode.com/problems/longest-palindromic-substring/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-26 01:56:01
// Runtime:    14 ms (beats 93.89%)
// Memory:     42.8 MB (beats 96.24%)
// Topics:     Two Pointers, String, Dynamic Programming, Manacher

class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length() < 2) return s;

        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++){
            int left = i;
            int right = i;

            int len1 = lenpalindrome(s, left, right);

            int len2 = lenpalindrome(s, left, right+1);

            int len = Math.max(len1, len2);

            if(len > (end - start + 1)){
                start = i - (len -1)/2;

                end = i + (len/2);
            }
        }

        return s.substring(start, end+1);
    }

    private int lenpalindrome(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }
}
