// 5. Longest Palindromic Substring
// https://leetcode.com/problems/longest-palindromic-substring/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-26 02:15:17
// Runtime:    15 ms (beats 65.95%)
// Memory:     43.1 MB (beats 71.96%)
// Topics:     Two Pointers, String, Dynamic Programming, Manacher

class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length() < 2) return s;

        int start = 0;
        int end = 0;

        for(int i=0; i<s.length(); i++){

            int len1 = len_sub(s, i, i);
            int len2 = len_sub(s, i, i+1);

            int len = Math.max(len1, len2);

            if(len > end-start+1){
                start = i - ((len-1)/2);
                end = i+(len/2);
            }
        }

        return s.substring(start, end+1);
    }

    private int len_sub(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }
}
