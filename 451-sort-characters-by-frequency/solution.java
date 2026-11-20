// 451. Sort Characters By Frequency
// https://leetcode.com/problems/sort-characters-by-frequency/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-18 20:06:14
// Runtime:    13 ms (beats 80.34%)
// Memory:     46 MB (beats 81.42%)
// Topics:     Hash Table, String, Sorting, Heap (Priority Queue), Bucket Sort, Counting

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch , 0)+1);
        };

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));

        pq.addAll(map.keySet());

        StringBuilder result = new StringBuilder();

        while(!pq.isEmpty()){
            char ch = pq.poll();

            int freq = map.get(ch);

            for(int i=0; i<freq; i++){
                result.append(ch);
            }

        }

        return result.toString();

    }
}
