// 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-19 01:21:20
// Runtime:    14 ms (beats 91.78%)
// Memory:     93.4 MB (beats 78.94%)
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
