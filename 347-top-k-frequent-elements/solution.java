// 347. Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-15 17:57:12
// Runtime:    16 ms (beats 46.66%)
// Memory:     47.2 MB (beats 73.17%)
// Topics:     Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int i : map.keySet()){
            pq.add(i);

            if(pq.size() > k){
                pq.remove();
            }
        }

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            result[i] = pq.remove();
        }

        return result;
    }
}
