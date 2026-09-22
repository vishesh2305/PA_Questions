// 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-24 14:19:48
// Runtime:    2 ms (beats 97.97%)
// Memory:     43.2 MB (beats 72.70%)
// Topics:     String, Stack, Bracket Sequences

class Solution {
    public boolean isValid(String s) {

        int n = s.length();

        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '(' ||ch == '{' ||ch == '['){
                st.push(ch);
            }else if(!st.isEmpty() && (ch == ')' || ch == '}' || ch == ']')){
                char first = st.pop();

                if((ch == ')' && first != '(') || (ch == '}' && first != '{') || (ch == ']' && first != '[')){
                    return false;
                }
            }else{
                return false;
            }
        };

        if(st.isEmpty()){
            return true;
        }
        return false;
        
    }
}
