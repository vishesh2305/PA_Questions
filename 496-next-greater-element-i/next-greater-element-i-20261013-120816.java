// 496. Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-10-13 12:08:16
// Runtime:    7 ms (beats 8.27%)
// Memory:     44.8 MB (beats 86.10%)
// Topics:     Array, Hash Table, Stack, Monotonic Stack

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        int index =0;

        for(int i=0; i<nums1.length; i++){
            int nextgreater = -1;
            for(int j = 0; j<nums2.length-1; j++){
                if(nums1[i] == nums2[j]){
                    for(int k=j+1; k<nums2.length; k++){
                        if(nums2[k] > nums2[j]){
                            nextgreater=nums2[k];
                            break;
                        }
                    }
                }
            }
            result[index++] = nextgreater;
        }
        return result;

    }
}
