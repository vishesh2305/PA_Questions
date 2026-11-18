// 128. Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-18 19:28:40
// Runtime:    28 ms (beats 83.07%)
// Memory:     95.2 MB (beats 58.01%)
// Topics:     Array, Hash Table, Union-Find

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i: nums){
            set.add(i);
        }
        
        int maxstreak = 1;
        for(int i : set){
            if(!set.contains(i-1)){
                int num = i;
                int currstreak = 1;
            
            while(set.contains(num+1)){
                num+=1;
                currstreak++;
            }
            maxstreak = Math.max(maxstreak, currstreak);
            }
        }
        return maxstreak;
    }
}
