// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-27 18:24:13
// Runtime:    5 ms (beats 83.75%)
// Memory:     76.8 MB (beats 67.26%)
// Topics:     Array, Two Pointers, Greedy

class Solution {
    public int maxArea(int[] height) {
        int MaxVol = Integer.MIN_VALUE;

        int left = 0;

        int right = height.length - 1;

        while(left <= right){
            int currVol = Math.min(height[left], height[right]) * (right - left);
            MaxVol = Math.max(MaxVol, currVol);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return MaxVol;
    }
}
