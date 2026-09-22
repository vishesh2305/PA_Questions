// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-09-12 05:20:05
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.8 MB (beats 63.13%)
// Topics:     Array, Two Pointers, Sorting

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j = n-1;
        int k= n+m-1;

        while(i >= 0 && j>=0){
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(i >=0){
            nums1[k--] = nums1[i--];
        }

        while(j >=0){
            nums1[k--] = nums2[j--];
        }
        
    }
}
