// 49. Group Anagrams
// https://leetcode.com/problems/group-anagrams/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-17 20:15:16
// Runtime:    7 ms (beats 80.51%)
// Memory:     48.9 MB (beats 92.62%)
// Topics:     Array, Hash Table, String, Sorting

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] ch= str.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
