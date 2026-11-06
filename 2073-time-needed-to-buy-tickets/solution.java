// 2073. Time Needed to Buy Tickets
// https://leetcode.com/problems/time-needed-to-buy-tickets/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-06 22:57:06
// Runtime:    12 ms (beats 11.26%)
// Memory:     45.7 MB (beats 32.05%)
// Topics:     Array, Queue, Simulation

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length; i++){
            q.offer(i);
        }

        int time =0;

        while(!q.isEmpty()){
            int person = q.poll();
            tickets[person]--;
            time++;
            if(person == k && tickets[person] == 0){
                return time;
            }

            if(tickets[person] > 0){
                q.offer(person);
            }
        }

        return time;
        
    }
}
