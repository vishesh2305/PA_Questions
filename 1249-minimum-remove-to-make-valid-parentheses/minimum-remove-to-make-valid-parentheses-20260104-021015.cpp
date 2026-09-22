// 1249. Minimum Remove to Make Valid Parentheses
// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
// Difficulty: Medium
// Language:   C++
// Submitted:  2026-01-04 02:10:15
// Runtime:    10 ms (beats 44.13%)
// Memory:     14.8 MB (beats 21.79%)
// Topics:     String, Stack

class Solution {
public:
    string minRemoveToMakeValid(string s) {

        stack<int> st;
        vector<bool> remove(s.size(), false);

        for(int i=0; i<s.size(); i++){

            if(s[i] == '('){
                st.push(i);
            }else if(s[i] == ')'){
                if(!st.empty()){
                    st.pop();
                }else{
                    remove[i] = true;
                }
            }

        }

        while(!st.empty()){
            remove[st.top()] = true;
            st.pop();
        };


        string result="";

        for(int i=0; i<s.size(); i++){
            if(!remove[i]){
                result+=s[i];
            }
        }


        return result;
        
    }
};
