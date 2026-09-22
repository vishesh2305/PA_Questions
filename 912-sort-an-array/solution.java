// 912. Sort an Array
// https://leetcode.com/problems/sort-an-array/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-08-27 02:09:47
// Runtime:    28 ms (beats 40.26%)
// Memory:     82.9 MB (beats 75.51%)
// Topics:     Array, Divide and Conquer, Sorting, Heap (Priority Queue), Merge Sort, Bucket Sort, Radix Sort, Counting Sort

class Solution {
    public int[] sortArray(int[] nums) {
        merge(nums , 0, nums.length-1);
        return nums;
    }

    private void merge(int[] nums, int left, int right){
        if(left < right){
        int mid = left + (right - left)/2;
        merge(nums, left , mid);
        merge(nums, mid+1, right);

        mergeSort(nums, left, right, mid);
        }
    }

    private void mergeSort(int[] nums, int left, int right, int mid){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0; i<n1; i++){
            L[i] = nums[left + i];
        }

        for(int i=0; i<n2; i++){
            R[i] = nums[mid + i + 1];
        }

        int i=0;
        int j=0;
        int k = left;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                nums[k++] = L[i++];
            }else{
                nums[k++] = R[j++];
            }
        };


        while(i<n1){
            nums[k++] = L[i++];
        }
        while(j<n2){
            nums[k++] = R[j++];
        }
        

    }

}
