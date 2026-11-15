// 1985. Find the Kth Largest Integer in the Array
// https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-15 17:42:11
// Runtime:    91 ms (beats 16.83%)
// Memory:     59 MB (beats 13.32%)
// Topics:     Array, String, Divide and Conquer, Sorting, Heap (Priority Queue), Quickselect

import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();

        for(String s : nums){
            pq.add(new BigInteger(s));
            if(pq.size() > k){
                pq.remove();
            }
        };

        return pq.remove().toString();
    }
}
