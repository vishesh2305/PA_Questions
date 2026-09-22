// 2089. Find Target Indices After Sorting Array
// https://leetcode.com/problems/find-target-indices-after-sorting-array/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-24 23:37:46
// Runtime:    0 ms (beats 100.00%)
// Memory:     44.5 MB (beats 96.91%)
// Topics:     Array, Binary Search, Sorting

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int smaller =0;
        int equals =0;

        for(int i : nums){
            if(i == target){
                equals++;
            }else if(i < target){
                smaller++;
            }
        }

        List<Integer> res = new ArrayList<>();

        for(int i=0; i<equals; i++){
            res.add(i+smaller);
        }

        return res;
        
    }
}
