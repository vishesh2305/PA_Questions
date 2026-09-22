// 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-06-04 01:51:13
// Runtime:    3 ms (beats 93.90%)
// Memory:     43.7 MB (beats 99.67%)
// Topics:     Hash Table, String, Sorting

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)-'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if(freq[i] !=0) return false;
        }
        return true;

    }
}
