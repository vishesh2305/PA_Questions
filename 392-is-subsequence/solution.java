// 392. Is Subsequence
// https://leetcode.com/problems/is-subsequence/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-09-05 01:46:28
// Runtime:    1 ms (beats 95.60%)
// Memory:     43.7 MB (beats 6.11%)
// Topics:     Two Pointers, String, Dynamic Programming

class Solution {
    public boolean isSubsequence(String s, String t) {
        return helper(s, t, 0, 0);
    }

    private boolean helper(String s, String t, int i , int j){
        if(i==s.length()) return true;
        if(j==t.length()) return false;

        if(s.charAt(i) == t.charAt(j)){
            return helper(s, t, i+1, j+1);
        }
        return helper(s, t , i , j+1);
    }
}
