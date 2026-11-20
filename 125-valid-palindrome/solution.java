// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-20 17:59:05
// Runtime:    3 ms (beats 74.48%)
// Memory:     44.3 MB (beats 57.98%)
// Topics:     Two Pointers, String

class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length() == 0) return true;

        char[] ch = s.toCharArray();

        int left =0;
        int right = ch.length - 1;

        while(left <= right){
            char l = ch[left];
            char r = ch[right];

            if(!Character.isLetterOrDigit(l)){
                left++;
            }else if(!Character.isLetterOrDigit(r)){
                right--;
            }else{

            if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }

            left++;
            right--;
            };

            
        }

        return true;

    }
}
