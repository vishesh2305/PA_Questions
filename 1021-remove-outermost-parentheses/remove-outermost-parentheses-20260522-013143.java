// 1021. Remove Outermost Parentheses
// https://leetcode.com/problems/remove-outermost-parentheses/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-05-22 01:31:43
// Runtime:    2 ms (beats 99.78%)
// Memory:     43 MB (beats 98.06%)
// Topics:     String, Stack, Bracket Sequences

class Solution {
    public String removeOuterParentheses(String s) {

        int depth =0;
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()){

            if(ch=='('){


                if(depth>0){
                    sb.append(ch);
                }
                depth++;

            }else{
                depth--;

                if(depth > 0){
                    sb.append(ch);
                }

            }

        }

        return sb.toString();
        
    }
}
