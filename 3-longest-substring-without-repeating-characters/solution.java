// 3. Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-25 23:17:28
// Runtime:    79 ms (beats 14.77%)
// Memory:     47.3 MB (beats 85.79%)
// Topics:     Hash Table, String, Sliding Window

class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        int MaxCount = 0;

        char[] ch = s.toCharArray();

        for(char c : ch){
            if(!set.contains(c)){
                set.add(c);
            }else{
                while(set.contains(c)){
                    set.removeFirst();
                }
                set.add(c);
            }
            MaxCount = Math.max(set.size(), MaxCount);
        }


        return MaxCount;
    }
}
