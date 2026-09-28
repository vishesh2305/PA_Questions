// 28. Find the Index of the First Occurrence in a String
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-09-28 05:53:34
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.7 MB (beats 95.63%)
// Topics:     Two Pointers, String, String Matching, Z Algorithm, Knuth–Morris–Pratt Algorithm, Boyer–Moore String-Search Algorithm

class Solution {
    public int strStr(String haystack, String needle) {
        haystack = haystack.toLowerCase();
        needle = needle.toLowerCase();

        if(!haystack.contains(needle)){
            return -1;
        }

        return haystack.indexOf(needle);

    }
}
