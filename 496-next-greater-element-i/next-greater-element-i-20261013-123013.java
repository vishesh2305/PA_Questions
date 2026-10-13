// 496. Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-10-13 12:30:13
// Runtime:    5 ms (beats 14.42%)
// Memory:     45.1 MB (beats 68.85%)
// Topics:     Array, Hash Table, Stack, Monotonic Stack

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            map.put(nums1[i], i);
        }

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<nums2.length; i++){
            int curr = nums2[i];
            while(!st.isEmpty() && st.peek() < curr){
                int temp = st.pop();
                if(map.containsKey(temp)){
                    int index = map.get(temp);
                    result[index] = curr;
                }
            }
            st.push(curr);
        }

        for(int i=0; i<nums1.length; i++){
            if(result[i] == 0){
                result[i] = -1;
            }
        }



        return result;

    }
}
