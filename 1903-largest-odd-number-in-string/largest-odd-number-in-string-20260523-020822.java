// 1903. Largest Odd Number in String
// https://leetcode.com/problems/largest-odd-number-in-string/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-05-23 02:08:22
// Runtime:    1 ms (beats 99.86%)
// Memory:     47.2 MB (beats 37.40%)
// Topics:     Math, String, Greedy

class Solution {
    public String largestOddNumber(String num) {



        for(int i=num.length()-1; i>=0; i--){
            int n = num.charAt(i)-'0';
            if(n % 2 != 0){
                return num.substring(0,i+1);
            }

        }

        return "";
        
    }
}
