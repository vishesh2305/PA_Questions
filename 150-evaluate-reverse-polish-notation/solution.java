// 150. Evaluate Reverse Polish Notation
// https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-22 19:41:05
// Runtime:    7 ms (beats 37.72%)
// Memory:     45.3 MB (beats 45.72%)
// Topics:     Array, Math, Stack

class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();


        for(String ch: tokens){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int n1 = (int)st.pop();
                int n2 = (int)st.pop();
                st.push(op(ch, n2, n1));
            }else{
                st.push(Integer.parseInt(ch));
            }
        }

        return st.pop();

    }

    private int op(String ch, int n1,int n2){
        if(ch.equals("+")){
            return n1+n2;
        }else if(ch.equals("-")){
            return n1-n2;
        }else if(ch.equals("*")){
            return n1*n2;
        }else if(ch.equals("/")){
            return n1/n2;
        }else{
            return 0;
        }
    }
}
