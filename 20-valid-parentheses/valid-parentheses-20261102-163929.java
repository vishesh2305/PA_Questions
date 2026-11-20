// 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-02 16:39:29
// Runtime:    3 ms (beats 85.61%)
// Memory:     43.1 MB (beats 65.16%)
// Topics:     String, Stack, Bracket Sequences

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c== '{' || c =='['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    if(c==')' && st.pop() != '(' || c==']' && st.pop() != '[' || c=='}' && st.pop() != '{'){
                        return false;
                    }
                }
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}
