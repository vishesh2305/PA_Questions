// 239. Sliding Window Maximum
// https://leetcode.com/problems/sliding-window-maximum/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-10-14 13:09:53
// Runtime:    32 ms (beats 34.58%)
// Memory:     146.2 MB (beats 53.07%)
// Topics:     Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue, Range Minimum/Maximum Query

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] result = new int[nums.length - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();
        int index =0;

        for(int i=0; i<nums.length; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.removeLast();
            };

            dq.addLast(i);

            if(i >= k-1){
                result[index++] = nums[dq.peekFirst()];
            }
        }

        return result;
        
    }
}
