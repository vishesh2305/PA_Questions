// 150. Evaluate Reverse Polish Notation
// https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Difficulty: Medium
// Language:   C++
// Submitted:  2026-01-03 13:03:31
// Runtime:    0 ms (beats 100.00%)
// Memory:     17 MB (beats 70.17%)
// Topics:     Array, Math, Stack

class Solution {
public:
    int evalRPN(vector<string>& tokens) {

        stack<int> s;
        int n = tokens.size();

        for (auto ch: tokens) {

            if(ch == "+" || ch == "-" || ch == "*"|| ch == "/"){
                int n1= s.top(); s.pop();
                int n2= s.top(); s.pop();
                s.push(oper(ch, n2,n1));
            }else{
                s.push(stoi(ch));
            }

        }

        return s.top();
    };

    int oper(string ch, int n1, int n2) {
        if (ch == "+")
            return n1 + n2;
        if (ch == "-")
            return n1 - n2;
        if (ch == "*")
            return n1 * n2;
        if (ch == "/")
            return n1 / n2;
        if (ch == "^")
            return pow(n1, n2);
        else
            return 0;
    }
};
