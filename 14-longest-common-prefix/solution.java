// 14. Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-06-04 03:37:57
// Runtime:    1 ms (beats 60.13%)
// Memory:     43.3 MB (beats 32.44%)
// Topics:     Array, String, Trie

class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        StringBuilder sb = new StringBuilder();


        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            
            if(first.charAt(i) != last.charAt(i)) return sb.toString();


            sb.append(first.charAt(i));

        }

        return sb.toString();
        
        

    }
}
