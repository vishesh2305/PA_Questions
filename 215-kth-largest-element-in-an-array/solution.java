// 215. Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-15 17:29:52
// Runtime:    158 ms (beats 5.96%)
// Memory:     72.5 MB (beats 96.13%)
// Topics:     Array, Divide and Conquer, Sorting, Heap (Priority Queue), Quickselect

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : nums){
            pq.add(i);
        }

        while(k > 1){
            pq.remove();
            k--;
        }

        return pq.peek();

    }
}
