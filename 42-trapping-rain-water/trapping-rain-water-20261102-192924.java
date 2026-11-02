// 42. Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-11-02 19:29:24
// Runtime:    7 ms (beats 4.30%)
// Memory:     47.4 MB (beats 82.98%)
// Topics:     Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack

class Solution {
    public int trap(int[] height) {

        Stack<Integer> st = new Stack<>();
        int totalWater = 0;

        for(int right =0; right<height.length; right++){
            while(!st.isEmpty() && height[right] > height[st.peek()]){
                int bottom = st.pop();
                if(st.isEmpty()) break;

                int left = st.peek();

                int b_h = Math.min(height[left], height[right]) - height[bottom];
                int width = right - left -1;

                totalWater += b_h * width;
            }
            st.push(right);
        }

        return totalWater;
        
    }
}
