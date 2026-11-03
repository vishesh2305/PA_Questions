// 1963. Minimum Number of Swaps to Make the String Balanced
// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-03 19:01:38
// Runtime:    90 ms (beats 15.03%)
// Memory:     66.2 MB (beats 14.97%)
// Topics:     Two Pointers, String, Stack, Greedy, Bracket Sequences

class Solution {
    public int minSwaps(String s) {

        if(s.length() % 2 !=0) return -1;

        Stack<Character> st = new Stack<>();

        int close =0;

        for(char c : s.toCharArray()){
            if(c==']'){
                if(st.isEmpty()){
                    close++;
                }else{
                    st.pop();
                }
            }else{
                st.add(c);
            }
        }

        return (close+1)/2;
        
    }
}
