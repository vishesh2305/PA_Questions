// 215. Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-15 17:31:24
// Runtime:    70 ms (beats 51.47%)
// Memory:     74 MB (beats 68.83%)
// Topics:     Array, Divide and Conquer, Sorting, Heap (Priority Queue), Quickselect

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int x : nums){
            pq.add(x);
            if(pq.size() > k){
                pq.remove();
            }
        }

        return pq.peek();
    }
}
