// 678. Valid Parenthesis String
// https://leetcode.com/problems/valid-parenthesis-string/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-05-15 21:46:37
// Runtime:    1 ms (beats 26.28%)
// Memory:     42.7 MB (beats 67.67%)
// Topics:     String, Dynamic Programming, Stack, Greedy, Bracket Sequences

class Solution {
    public boolean checkValidString(String s) {


        Stack<Integer> st = new Stack<>();
        Stack<Integer> star_st = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);


            if(ch == '('){
                st.push(i);
            }else if(ch == '*'){
                star_st.push(i);
            }else{


                if(!st.isEmpty()){
                    st.pop();
                }else if(!star_st.isEmpty()){
                    star_st.pop();
                }else{
                    return false;
                }
            }

        }

        while(!st.isEmpty() && !star_st.isEmpty()){
            if(st.peek() < star_st.peek()){

                st.pop();
                star_st.pop();
            }else{
                return false;
            }
        }

            return st.isEmpty();
    }
}
