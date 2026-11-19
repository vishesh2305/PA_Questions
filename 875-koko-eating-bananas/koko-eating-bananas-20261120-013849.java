// 875. Koko Eating Bananas
// https://leetcode.com/problems/koko-eating-bananas/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-20 01:38:49
// Runtime:    8 ms (beats 75.46%)
// Memory:     47.2 MB (beats 83.09%)
// Topics:     Array, Binary Search

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MIN_VALUE;

        for(int i: piles){
            if(i > right){
                right = i;
            }
        }

        int ans = right;

        while(left <= right){
            int mid = left + (right - left)/2;
            long total_hours = 0;

            for(int pile : piles){
                total_hours += (pile + mid - 1)/mid;
            }

            if(total_hours <= h){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return ans;



    }
}
