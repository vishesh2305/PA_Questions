// 347. Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-15 17:55:02
// Runtime:    18 ms (beats 15.25%)
// Memory:     47.1 MB (beats 76.74%)
// Topics:     Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i : map.keySet()){
            pq.add(i);
            if(pq.size() > k){
                pq.remove();
            }
        }

        int[] result = new int[k];
        int index = 0;

        while(!pq.isEmpty()){
            result[index++] = pq.remove();
        }

        return result;
    }
}
