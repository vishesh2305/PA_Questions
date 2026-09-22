// 455. Assign Cookies
// https://leetcode.com/problems/assign-cookies/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-11 02:57:27
// Runtime:    15 ms (beats 59.74%)
// Memory:     51.4 MB (beats 74.78%)
// Topics:     Array, Two Pointers, Greedy, Sorting, Quicksort

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int gIndex =0;

        for(int i=0; i<s.length && gIndex < g.length; i++){
            if(s[i] >= g[gIndex]){
                gIndex++;
            }
        }

        

        return gIndex;

        

        
    }
}
