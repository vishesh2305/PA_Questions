// 921. Minimum Add to Make Parentheses Valid
// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
// Difficulty: Medium
// Language:   C++
// Submitted:  2026-01-04 00:58:23
// Runtime:    0 ms (beats 100.00%)
// Memory:     8.5 MB (beats 56.46%)
// Topics:     String, Stack, Greedy, Bracket Sequences

class Solution {
public:

    int minAddToMakeValid(string s) {
        stack<char> st;

        int moves =0;
        for(auto c: s){
            char ch= c;

            if(c=='('){
                st.push(c);
            }else{
                if(st.empty()){
                    moves++;
                }else{
                    st.pop();
                }
            }

        }

        while(!st.empty()){
            moves++;
            st.pop();
        };
        return moves;
    }
};


 
