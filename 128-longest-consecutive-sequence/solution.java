// 128. Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-18 01:09:23
// Runtime:    30 ms (beats 77.79%)
// Memory:     95.6 MB (beats 32.49%)
// Topics:     Array, Hash Table, Union-Find

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int longestStreak = 0;

        for(int i : set){
            if(!set.contains(i-1)){
                int num = i;
                int curStreak = 1;

                while(set.contains(num+1)){
                    num+=1;
                    curStreak++;
                }

                longestStreak = Math.max(longestStreak, curStreak);
            }
        }

        return longestStreak;
    }
}
