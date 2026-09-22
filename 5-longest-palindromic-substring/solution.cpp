// 5. Longest Palindromic Substring
// https://leetcode.com/problems/longest-palindromic-substring/
// Difficulty: Medium
// Language:   C++
// Submitted:  2026-06-23 13:08:33
// Runtime:    9 ms (beats 62.71%)
// Memory:     9.3 MB (beats 91.82%)
// Topics:     Two Pointers, String, Dynamic Programming, Manacher

class Solution {
public:
    string longestPalindrome(string s) {

        int n = s.size();

        int start =0;
        int maxLen = 1;

        for(int i=0; i<n; i++){
            int left = i;
            int right = i;

            while(left >= 0 && right < n && s[left] == s[right]){
                int len = right - left + 1;
                if(len > maxLen){
                    maxLen = len; 
                    start = left;
                }
                left--;
                right++;
            }

            left = i;
            right = i+1;

            while(left >= 0 && right < n && s[left] == s[right]){
                int len = right - left + 1;
                if(len > maxLen){
                    maxLen = len;
                    start = left;
                }
                left--;
                right++;
            }
        }

        return s.substr(start, maxLen);
        
    }
};
