// 1967. Number of Strings That Appear as Substrings in Word
// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-06-29 16:41:45
// Runtime:    1 ms (beats 82.92%)
// Memory:     43.1 MB (beats 58.92%)
// Topics:     Array, String

class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int count =0;
        for(String s : patterns){
            if(word.contains(s)){
                count++;
            }
        }

        return count;
        
    }
}
