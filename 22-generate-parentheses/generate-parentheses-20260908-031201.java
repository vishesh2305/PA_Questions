// 22. Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-08 03:12:01
// Runtime:    0 ms (beats 100.00%)
// Memory:     44.2 MB (beats 92.77%)
// Topics:     String, Dynamic Programming, Backtracking, Bracket Sequences

class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n, 0, 0, new StringBuilder());
        return result;
    }
    private void helper(int n , int open , int close , StringBuilder sb){
        if(open == n && close == open){
            result.add(sb.toString());
            return;
        }

        if(open < n){
            sb.append("(");
            helper(n, open+1, close, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(close < open){
            sb.append(")");
            helper(n, open, close + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
