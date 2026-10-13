// 503. Next Greater Element II
// https://leetcode.com/problems/next-greater-element-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-10-13 13:00:48
// Runtime:    14 ms (beats 61.17%)
// Memory:     48.6 MB (beats 46.71%)
// Topics:     Array, Stack, Monotonic Stack

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int[] result = new int[nums.length];

        Arrays.fill(result, -1);

        Stack<Integer> st = new Stack<>();

        int n = nums.length;

        for(int i=0; i<n*2; i++){
            int curr = nums[i % n];
            while(!st.isEmpty() && nums[st.peek()] < curr){
                int index = st.pop();
                result[index] = curr;
            };

            st.push(i % n);
        };

        return result;
        
    }
}
