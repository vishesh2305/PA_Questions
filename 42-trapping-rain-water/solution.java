// 42. Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-07-17 01:38:22
// Runtime:    0 ms (beats 100.00%)
// Memory:     47.4 MB (beats 89.27%)
// Topics:     Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack

class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int l = 0;
        int r = n-1;

        int lm = 0;
        int rm =0;

        int total =0;

        while(l <= r){
            if(height[l] < height[r]){
                if(height[l] >= lm){
                    lm = height[l];
                }else{
                    total+= lm - height[l];
                }
                l++;
            }else{
                if(height[r] >= rm){
                    rm = height[r];
                }else{
                    total+= rm - height[r];
                }
                r--;
            }
        }
        return total;
        
    }
}
