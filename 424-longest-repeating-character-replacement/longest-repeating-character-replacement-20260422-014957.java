// 424. Longest Repeating Character Replacement
// https://leetcode.com/problems/longest-repeating-character-replacement/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-22 01:49:57
// Runtime:    8 ms (beats 68.42%)
// Memory:     46.2 MB (beats 64.91%)
// Topics:     Hash Table, String, Sliding Window

class Solution {
    public int characterReplacement(String s, int k) {

        int n= s.length();

        int left =0;

        int max_len =0;
        int max_freq =0;


        int[] arr = new int[26];


        for(int i=0; i<n; i++){

            char ch = s.charAt(i);

            arr[ch-'A']++;

            if(max_freq < arr[ch-'A']){
                max_freq = arr[ch-'A'];
            }

            if(i - left + 1 - max_freq > k){
                arr[s.charAt(left) - 'A']--;
                left++;
            }

            max_len = Math.max(i - left + 1, max_len);

        }
        return max_len ;

        
    }
}
