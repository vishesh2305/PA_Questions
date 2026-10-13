// 503. Next Greater Element II
// https://leetcode.com/problems/next-greater-element-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-10-13 13:09:02
// Runtime:    15 ms (beats 53.82%)
// Memory:     48.4 MB (beats 58.76%)
// Topics:     Array, Stack, Monotonic Stack

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int[] result = new int[nums.length];

        int n = nums.length;

        Arrays.fill(result, -1);

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n*2; i++){

            int curr = nums[i % n];

            while(!st.isEmpty() && nums[st.peek()] < curr){
                int index = st.pop();
                result[index] = curr;
            };
            st.push(i % n);
        }
        return result;
        
    }
}
