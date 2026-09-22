// 17. Letter Combinations of a Phone Number
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-08 02:38:20
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.2 MB (beats 95.08%)
// Topics:     Hash Table, String, Backtracking

class Solution {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {

        String[] phchars = {
            "","",
            "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        helper(digits, phchars, 0, new StringBuilder());
        return result;
    }

    private void helper(String digits, String[] phchars, int index, StringBuilder sb){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';

        for(char ch : phchars[digit].toCharArray()){
            sb.append(ch);
            helper(digits, phchars, index+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
