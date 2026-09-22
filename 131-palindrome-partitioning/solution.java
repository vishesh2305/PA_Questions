// 131. Palindrome Partitioning
// https://leetcode.com/problems/palindrome-partitioning/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-08 03:26:02
// Runtime:    8 ms (beats 73.59%)
// Memory:     65.5 MB (beats 13.71%)
// Topics:     String, Dynamic Programming, Backtracking

class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s, 0, new ArrayList<>());
        return result;
    }

    private void helper(String s, int index, List<String> ds){

        if(index == s.length()){
            result.add(new ArrayList<>(ds));
            return;
        }

        for(int i= index; i<s.length(); i++){
            String ch = s.substring(index, i+1);
            if(checkPalindrome(ch)){
                ds.add(ch);
                helper(s, i + 1, ds);
                ds.remove(ds.size()-1);
            }
        }
    }

    private boolean checkPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
