// 2073. Time Needed to Buy Tickets
// https://leetcode.com/problems/time-needed-to-buy-tickets/
// Difficulty: Easy
// Language:   C++
// Submitted:  2025-12-19 15:36:17
// Runtime:    0 ms (beats 100.00%)
// Memory:     10.5 MB (beats 67.07%)
// Topics:     Array, Queue, Simulation

class Solution {
public:
    int timeRequiredToBuy(vector<int>& tickets, int k) {

        if(k<0) return 0;

        int time =0;

        int n=tickets.size();

        for(int i=0; i<n; i++){
            if(i<=k){
                time+= min(tickets[i], tickets[k]);
            }else{
                time+= min(tickets[i], tickets[k] -1);
            }
        }
        return time;
        
    }
};
