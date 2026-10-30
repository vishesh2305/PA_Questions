// 1046. Last Stone Weight
// https://leetcode.com/problems/last-stone-weight/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-10-30 20:43:59
// Runtime:    1 ms (beats 99.63%)
// Memory:     42.5 MB (beats 83.23%)
// Topics:     Array, Heap (Priority Queue)

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int x : stones){
            pq.offer(x);
        }

        while(pq.size() > 1){
            int first = pq.poll();

            int second = pq.poll();

            if(first != second){
                pq.offer(first - second);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();


    }
}
