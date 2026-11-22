// 875. Koko Eating Bananas
// https://leetcode.com/problems/koko-eating-bananas/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-22 18:38:18
// Runtime:    8 ms (beats 75.85%)
// Memory:     47.1 MB (beats 89.97%)
// Topics:     Array, Binary Search

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxspeed = Integer.MIN_VALUE;

        for(int i : piles){
            maxspeed = Math.max(maxspeed, i);
        }

        int left = 1;
        int right = maxspeed;

        int k = 0;

        while(left <= right){
            int mid = left + (right-left)/2;

            long th = 0;

            for(int i : piles){
                th += (i + mid - 1)/mid;
            }

            if(th <= h){
                k = mid;
                right = mid-1;
            }else{
                left=mid+1;
            }

        }

        return k;

    }
}
