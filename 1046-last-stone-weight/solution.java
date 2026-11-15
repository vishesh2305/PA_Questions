// 1046. Last Stone Weight
// https://leetcode.com/problems/last-stone-weight/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-15 17:24:54
// Runtime:    2 ms (beats 39.19%)
// Memory:     42.4 MB (beats 68.20%)
// Topics:     Array, Heap (Priority Queue)

class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1)
            return stones[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : stones) {
            pq.add(i);
        }

        for (int i = 0; i < stones.length - 1; i++) {
            int first = pq.remove();
            int second = pq.remove();
            pq.add(first - second);
        }

        return pq.remove();

    }
}
