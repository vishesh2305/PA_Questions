// 229. Majority Element II
// https://leetcode.com/problems/majority-element-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-07 04:59:04
// Runtime:    2 ms (beats 99.92%)
// Memory:     52.8 MB (beats 22.22%)
// Topics:     Array, Hash Table, Sorting, Counting, Boyer–Moore Majority Vote Algorithm

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cn1 = 0;
        int cn2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i : nums){
            if(cn1==0 && i != el2){
                cn1 = 1;
                el1= i;
            }else if(cn2 ==0 && i != el1){
                cn2 = 1;
                el2=i;
            }else if(i == el1){
                cn1++;
            }else if(i == el2){
                cn2++;
            }else{
                cn1--;
                cn2--;
            }
        }
        int Min_count = nums.length/3;
        cn1 =0;
        cn2=0;
        for(int i:nums){
            if(i == el1){
                cn1++;
            }else if(i == el2){
                cn2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        if(cn1 > Min_count){
            result.add(el1);
        }
        if(cn2 > Min_count){
            result.add(el2);
        }
        return result;
    }
}
