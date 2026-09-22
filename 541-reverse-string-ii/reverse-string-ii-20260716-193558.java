// 541. Reverse String II
// https://leetcode.com/problems/reverse-string-ii/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-16 19:35:58
// Runtime:    1 ms (beats 96.11%)
// Memory:     44.7 MB (beats 61.57%)
// Topics:     Two Pointers, String

class Solution {
    public String reverseStr(String s, int k) {

        int n = s.length();

        

        

        char[] ch = s.toCharArray();

        for(int i=0; i<n; i+=(k*2)){
            int end = Math.min(i+k-1, n-1);
            revStr(ch, i, end);
        }

        return String.valueOf(ch);

        
    }

    public static void revStr(char[] str, int start, int end){
        while(start <= end){
            char t = str[start];
            str[start++] = str[end];
            str[end--] = t;
        }
    }
}
