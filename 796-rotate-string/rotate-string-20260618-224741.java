// 796. Rotate String
// https://leetcode.com/problems/rotate-string/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-06-18 22:47:41
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.9 MB (beats 97.96%)
// Topics:     String, String Matching

class Solution {
    public boolean rotateString(String s, String goal) {

        if(goal.length() != s.length()) return false;
        

        String new_string = goal+goal;

        return new_string.contains(s);
        
    }
}
