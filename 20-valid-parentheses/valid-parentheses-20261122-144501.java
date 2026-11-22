// 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-22 14:45:01
// Runtime:    4 ms (beats 41.47%)
// Memory:     42.8 MB (beats 85.61%)
// Topics:     String, Stack, Bracket Sequences

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c== '{' || c== '['){
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                
                if(c == ')' && st.peek() == '('){
                    st.pop();
                }else if(c == '}' && st.peek() == '{'){
                    st.pop();
                }else if(c == ']' && st.peek() == '['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        if(!st.isEmpty()) return false;

        return true;
    }
}
