// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-18 01:02:11
// Runtime:    13 ms (beats 31.15%)
// Memory:     55.4 MB (beats 5.07%)
// Topics:     Two Pointers, String

class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("\\s+", ""); // It will remove all the leading , trailing , or in between spaces from the string . 

        

        // System.out.println(s);
        return checkpalindrome(s, 0, s.length()-1);
        // return true;
    }
    private boolean checkpalindrome(String s, int left, int right){

        if(left >=right){
            return true;
        }

        char l = Character.toLowerCase(s.charAt(left));
        char r = Character.toLowerCase(s.charAt(right));


        if(!Character.isLetterOrDigit(l)){
            return checkpalindrome(s, ++left, right);
        }
        
        if(!Character.isLetterOrDigit(r)){
            return checkpalindrome(s, left, --right);
        }

        if(l != r){
            return false;
        }
        
        return checkpalindrome(s, ++left, --right);

    }
}
