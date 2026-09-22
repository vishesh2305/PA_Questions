// 238. Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-10 02:12:47
// Runtime:    2 ms (beats 92.64%)
// Memory:     72.1 MB (beats 43.76%)
// Topics:     Array, Prefix Sum

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        result[0] = 1;

        for(int i=1; i<n; i++){
            result[i] =result[i-1] * nums[i-1];
        }

        int suffix = 1;

        for(int i=n-1; i>=0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
        
    }
}
