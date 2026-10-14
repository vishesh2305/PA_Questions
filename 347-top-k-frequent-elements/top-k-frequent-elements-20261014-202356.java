// 347. Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-10-14 20:23:56
// Runtime:    16 ms (beats 40.88%)
// Memory:     47.4 MB (beats 90.87%)
// Topics:     Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        };

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b)
        );

        for(int x : map.keySet()){
            pq.add(x);
            if(pq.size() > k){
                pq.poll();
            }
        };

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            result[i] = pq.poll();
        }

        return result;

    }
}
