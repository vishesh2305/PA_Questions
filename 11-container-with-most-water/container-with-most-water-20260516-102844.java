// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-05-16 10:28:44
// Runtime:    5 ms (beats 82.74%)
// Memory:     77.5 MB (beats 12.89%)
// Topics:     Array, Two Pointers, Greedy

class Solution {
    public int maxArea(int[] height) {

        int left =0;

        int right = height.length - 1;

        int maxvol =Integer.MIN_VALUE;


        while(left < right){
            int h = Math.min(height[left], height[right]);
            int d = right-left;

            maxvol = Math.max(maxvol, h*d);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        return maxvol;
        
    }
}
