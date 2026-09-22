// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-15 20:58:27
// Runtime:    0 ms (beats 100.00%)
// Memory:     61 MB (beats 97.63%)
// Topics:     Array, Math, Two Pointers

class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k=k%n;

        reverseArray(nums, 0, n-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);
        
    }

    public void reverseArray(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;

        }
    }
}
