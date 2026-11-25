// 150. Evaluate Reverse Polish Notation
// https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-25 15:13:15
// Runtime:    8 ms (beats 14.51%)
// Memory:     45 MB (beats 51.27%)
// Topics:     Array, Math, Stack

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int s1 = st.pop();
                int s2 = st.pop();
                st.push(operate(s2, s1, s));

            }else{
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }

    private int operate(int s1, int s2, String op){
        if(op.equals("*")){
            return s1*s2;
        }else if(op.equals("/")){
            return s1/s2;
        }else if(op.equals("+")){
            return s1+s2;
        }else if(op.equals("-")){
            return s1 - s2;
        }

        return -1;
    }
}
