// 169. Majority Element
// https://leetcode.com/problems/majority-element/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-07 00:42:36
// Runtime:    1 ms (beats 99.88%)
// Memory:     55.5 MB (beats 61.87%)
// Topics:     Array, Hash Table, Divide and Conquer, Sorting, Counting, Boyer–Moore Majority Vote Algorithm

class Solution {
    public int majorityElement(int[] nums) {

        int count =0;

        int element = nums[0];

        for(int i=0; i<nums.length; i++){
            if(count == 0){
                element = nums[i];
                count++;
            }else if(nums[i] == element){
                count ++;
            }else{
                count--;
            }
        }

        return element;
        
    }
}
