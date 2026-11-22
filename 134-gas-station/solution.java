// 134. Gas Station
// https://leetcode.com/problems/gas-station/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-22 20:40:40
// Runtime:    2 ms (beats 99.21%)
// Memory:     119 MB (beats 67.99%)
// Topics:     Array, Greedy

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        for(int i=0; i<gas.length; i++){
            totalgas+= gas[i];
            totalcost+= cost[i];
        }

        if(totalgas < totalcost) return -1;

        int startIndex = 0;
        int currgas = 0;

        for(int i=0; i<gas.length; i++){
            currgas += gas[i] - cost[i];

            if(currgas <0){
                startIndex = i+1;
                currgas = 0;
            }
        }
        return startIndex;
    }
}
