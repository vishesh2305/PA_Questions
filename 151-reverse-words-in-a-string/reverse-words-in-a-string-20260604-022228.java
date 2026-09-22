// 151. Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-06-04 02:22:28
// Runtime:    8 ms (beats 34.75%)
// Memory:     44.7 MB (beats 28.11%)
// Topics:     Two Pointers, String

class Solution {
    public String reverseWords(String s) {

        s = s.trim();
        String[] words = s.split("\\s+");

        StringBuilder sb =new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            if(i==0){
               sb.append(words[i]); 
            }else{
            sb.append(words[i]+" ");
            }
        }

        return sb.toString();
        
    }
}
