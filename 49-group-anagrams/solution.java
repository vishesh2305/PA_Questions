// 49. Group Anagrams
// https://leetcode.com/problems/group-anagrams/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-03-27 03:03:02
// Runtime:    7 ms (beats 72.18%)
// Memory:     49.6 MB (beats 73.06%)
// Topics:     Array, Hash Table, String, Sorting

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();

            Arrays.sort(chars);


            String key = new String(chars);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);

        }

        return new ArrayList<>(map.values());
        
    }
}
