// 31. Next Permutation
// https://leetcode.com/problems/next-permutation/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-06-30 15:23:01
// Runtime:    0 ms (beats 100.00%)
// Memory:     44.7 MB (beats 51.47%)
// Topics:     Array, Two Pointers

class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        boolean isInc = true;

        for(int i=n-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                isInc = false;
                for(int j=n-1; j>=i; j--){
                    if(nums[j] > nums[i-1]){
                        int temp = nums[j];
                        nums[j] = nums[i-1];
                        nums[i-1] = temp;
                        break;
                    }
                    
                }
                reverse_array(nums, i);
                break;
            }
        }

        if(isInc){
            reverse_array(nums, 0);
        }
        
    }

    public void reverse_array(int[] arr , int pivot){
        int left = pivot;
        int right = arr.length - 1;

        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
