// 496. Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-10-13 12:30:46
// Runtime:    4 ms (beats 73.10%)
// Memory:     45.4 MB (beats 34.59%)
// Topics:     Array, Hash Table, Stack, Monotonic Stack

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        HashMap<Integer, Integer> map = new HashMap<>();
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
