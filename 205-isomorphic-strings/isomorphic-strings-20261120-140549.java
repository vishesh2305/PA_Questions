// 205. Isomorphic Strings
// https://leetcode.com/problems/isomorphic-strings/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-20 14:05:49
// Runtime:    5 ms (beats 98.72%)
// Memory:     43.5 MB (beats 64.99%)
// Topics:     Hash Table, String

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapST[c1] == 0 && mapTS[c2] == 0){
                mapST[c1] = c2;
                mapTS[c2] = c1;
            }else{
                if(mapST[c1] != c2 || mapTS[c2] != c1){
                    return false;
                }
            }
        }

        return true;
        

    }
}
