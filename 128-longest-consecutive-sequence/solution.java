// 128. Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-18 01:04:10
// Runtime:    30 ms (beats 77.79%)
// Memory:     95.2 MB (beats 51.32%)
// Topics:     Array, Hash Table, Union-Find

class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums){
            set.add(i);
        }

        int MaxStreak = 0;

        for(int i : set){
            if(!set.contains(i-1)){
                int num = i;
                int curStreak = 1;
            

            while(set.contains(num+1)){
                num += 1;
                curStreak++;
            }

            MaxStreak = Math.max(MaxStreak, curStreak);
            };

        }

        return MaxStreak;

        

    }
}
