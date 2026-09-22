// 347. Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-03-31 02:20:37
// Runtime:    16 ms (beats 39.41%)
// Memory:     47.6 MB (beats 49.35%)
// Topics:     Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    int n= nums.length;

    HashMap<Integer, Integer> map = new HashMap<>();

    for(int num : nums){
    map.put(num, map.getOrDefault(num, 0)+1);
    }

    ArrayList<Integer> list = new ArrayList<>(map.keySet());

    Collections.sort(list, (a , b) -> map.get(b) - map.get(a));

    int[] result = new int[k];

    for(int i=0; i<k; i++){
        result[i] = list.get(i);
    }

    return result;
    }

}
