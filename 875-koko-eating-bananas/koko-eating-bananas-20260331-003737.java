// 875. Koko Eating Bananas
// https://leetcode.com/problems/koko-eating-bananas/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-03-31 00:37:37
// Runtime:    7 ms (beats 84.08%)
// Memory:     47.9 MB (beats 42.81%)
// Topics:     Array, Binary Search

class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;

        int right = Integer.MIN_VALUE;

        for(int pile: piles){
            if(pile > right){
                right = pile;
            }
        }

        int ans = right;

        while(left <= right){
            int mid = left+(right-left)/2;

            long total_hours = 0;
            for(int pile: piles){
                total_hours+= (pile+mid-1)/mid;
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
