// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-21 00:47:44
// Runtime:    5 ms (beats 83.54%)
// Memory:     76.6 MB (beats 90.69%)
// Topics:     Array, Two Pointers, Greedy

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 1) return 0;
        int left = 0;

        int right = height.length - 1;

        long MaxVol = Integer.MIN_VALUE;

        while(left <= right){
            int currVol = Math.min(height[left], height[right]) * (right-left);
            MaxVol = Math.max(MaxVol, currVol);

            if(height[right] < height[left]){
                right--;
            }else{
                left++;
            }
            
        }

        return (int)MaxVol;
    }
}
