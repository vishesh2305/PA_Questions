// 438. Find All Anagrams in a String
// https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-03-26 02:14:18
// Runtime:    10 ms (beats 80.60%)
// Memory:     46.7 MB (beats 82.24%)
// Topics:     Hash Table, String, Sliding Window

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if(s.length() < p.length()) return result;

        int[] p_freq = new int[26];

        for(int i=0; i<p.length(); i++){
            p_freq[p.charAt(i) - 'a']++;
        }


        int[] window_freq = new int[26];
        int window_size =p.length();

        for(int i=0; i<window_size; i++){
            window_freq[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(p_freq, window_freq)){
            result.add(0);
        }


        for(int i=window_size; i<s.length(); i++){

            window_freq[s.charAt(i)-'a']++;

            window_freq[s.charAt(i-window_size)-'a']--;

            if(Arrays.equals(p_freq, window_freq)){
                result.add(i-window_size+1);
            }

        }

        return result;
        
    }
}
