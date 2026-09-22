// 3. Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-21 20:29:42
// Runtime:    2 ms (beats 99.71%)
// Memory:     44.4 MB (beats 99.57%)
// Topics:     Hash Table, String, Sliding Window

class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean Seen[] = new boolean[128];
        int MaxLen =0;
        int left =0;

        for(int right =0; right < s.length(); right++){
            while(Seen[s.charAt(right)]){
                Seen[s.charAt(left)] = false;
                left++;
            };

            Seen[s.charAt(right)] = true;
            MaxLen = Math.max(MaxLen, right - left + 1);
        }

        return MaxLen;

    }
}
