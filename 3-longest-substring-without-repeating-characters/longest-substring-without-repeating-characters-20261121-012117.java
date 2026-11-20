// 3. Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-21 01:21:17
// Runtime:    80 ms (beats 14.16%)
// Memory:     47.3 MB (beats 79.02%)
// Topics:     Hash Table, String, Sliding Window

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        int MaxLen = Integer.MIN_VALUE;

        for(char c : s.toCharArray()){

            if(set.contains(c)){
                while(set.contains(c)){
                    set.removeFirst();
                };
            }
            set.add(c);

            MaxLen = Math.max(MaxLen, set.size());
        }

        return MaxLen;
    }
}
