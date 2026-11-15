// 402. Remove K Digits
// https://leetcode.com/problems/remove-k-digits/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-15 13:34:02
// Runtime:    21 ms (beats 52.58%)
// Memory:     47.4 MB (beats 40.22%)
// Topics:     String, Stack, Greedy, Monotonic Stack

class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";

        Stack<Integer> st = new Stack<>();

        char[] ch = num.toCharArray();

        st.push(ch[0] -'0');

        for(int i=1; i<ch.length; i++){
            while(!st.isEmpty() && k > 0 && st.peek() > (ch[i] - '0')){
                st.pop();
                k--;
            }
            st.push(ch[i] - '0');
        };

        while(k != 0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        sb = sb.reverse();

        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        if(sb.length() == 0){
            return "0";
        }

        return sb.toString();
    }
}
