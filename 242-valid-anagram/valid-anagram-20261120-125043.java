// 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-20 12:50:43
// Runtime:    17 ms (beats 20.18%)
// Memory:     46 MB (beats 41.39%)
// Topics:     Hash Table, String, Sorting

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }


        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0){
                    map.remove(c);
                };
            }else{
                return false;
            }
        }

        if(!map.isEmpty()){
            return false;
        }
        return true;

    }
}
