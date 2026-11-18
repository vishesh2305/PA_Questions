// 692. Top K Frequent Words
// https://leetcode.com/problems/top-k-frequent-words/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-18 20:32:01
// Runtime:    8 ms (beats 66.17%)
// Memory:     46 MB (beats 85.00%)
// Topics:     Array, Hash Table, String, Trie, Sorting, Heap (Priority Queue), Bucket Sort, Counting

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String s : words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> {
            int freq1 = map.get(a);
            int freq2 = map.get(b);

            if(freq1 == freq2){
                return a.compareTo(b);
            }

            return freq2-freq1;

            
        });

        pq.addAll(map.keySet());

        String[] result = new String[k];
        int index =0;
        while(k > 0){
            result[index++] = pq.poll();
            k--;
        };


        return new ArrayList<>(Arrays.asList(result));
    }
}
