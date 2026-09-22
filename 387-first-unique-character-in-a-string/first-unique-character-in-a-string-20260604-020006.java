// 387. First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-06-04 02:00:06
// Runtime:    5 ms (beats 98.32%)
// Memory:     47.4 MB (beats 6.07%)
// Topics:     Hash Table, String, Queue, Counting

class Solution {
    public int firstUniqChar(String s) {

        int n = s.length();

        int[] freq = new int[26];

        for(int i=0; i<n; i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<n; i++){
            if(freq[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;

        


    }
}
