// 977. Squares of a Sorted Array
// https://leetcode.com/problems/squares-of-a-sorted-array/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-17 00:56:52
// Runtime:    1 ms (beats 100.00%)
// Memory:     47.1 MB (beats 86.27%)
// Topics:     Array, Two Pointers, Sorting

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n=nums.length;

        int left =0;
        int right =n-1;
        int i=n-1;

        int[] result = new int[n];

        while(left <= right){
            int ans1 = nums[left]*nums[left];
            int ans2 = nums[right]* nums[right];
            if(ans1 > ans2){
                result[i] = ans1;
                left++;
            }else{
                result[i] = ans2;
                right--;
            }
            i--;
        }
        return result;
        
    }
}
