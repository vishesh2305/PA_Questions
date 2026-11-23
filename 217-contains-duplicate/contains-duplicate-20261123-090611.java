// 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-23 09:06:11
// Runtime:    18 ms (beats 78.65%)
// Memory:     108 MB (beats 44.44%)
// Topics:     Array, Hash Table, Sorting

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }

        return false;
    }
}
