// 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-19 01:21:20
// Runtime:    14 ms (beats 92.17%)
// Memory:     93.4 MB (beats 76.96%)
// Topics:     Array, Hash Table, Sorting

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
        }
        return false;
    }
}
