// 344. Reverse String
// https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-15 01:07:42
// Runtime:    1 ms (beats 21.27%)
// Memory:     48.7 MB (beats 7.04%)
// Topics:     Two Pointers, String

class Solution {

    public void recursion(char[] s, int left , int right){
        if(left >= right){
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        recursion(s, left+1, right-1);
    }

    public void reverseString(char[] s) {
        recursion(s, 0, s.length - 1);
    }
}
