// 621. Task Scheduler
// https://leetcode.com/problems/task-scheduler/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-10-30 20:59:22
// Runtime:    26 ms (beats 38.80%)
// Memory:     47.6 MB (beats 92.89%)
// Topics:     Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int f : freq){
            if(f > 0){
                pq.offer(f);
            }
        }

        Queue<int[]> cooldown = new LinkedList<>();
        int time =0;
        while(!pq.isEmpty() || !cooldown.isEmpty()){
            time++;
            if(!cooldown.isEmpty() && cooldown.peek()[1] <= time){
                int[] ready = cooldown.poll();
                pq.offer(ready[0]);
            }
            if(!pq.isEmpty()){
                int remaining = pq.poll();
                remaining--;
                if(remaining > 0){
                    cooldown.offer(new int[] {remaining, time+1+n});
                }
            }
        }

        return time;
    }
}
