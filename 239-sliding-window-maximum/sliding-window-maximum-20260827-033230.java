// 239. Sliding Window Maximum
// https://leetcode.com/problems/sliding-window-maximum/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-08-27 03:32:30
// Runtime:    29 ms (beats 84.27%)
// Memory:     146.9 MB (beats 41.49%)
// Topics:     Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue, Range Minimum/Maximum Query

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        Deque<Integer> dq = new ArrayDeque<>();

        int index =0;

        int[] result = new int[n-k+1];


        for(int i=0; i<n; i++){

            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k-1){
                result[index++] = nums[dq.peekFirst()];
            }
        }

        return result;
        
    }
}
