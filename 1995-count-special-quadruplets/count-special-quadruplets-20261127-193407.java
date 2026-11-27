// 1995. Count Special Quadruplets
// https://leetcode.com/problems/count-special-quadruplets/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-27 19:34:07
// Runtime:    13 ms (beats 38.76%)
// Memory:     42.4 MB (beats 98.22%)
// Topics:     Array, Hash Table, Enumeration

class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;

        int count =0;

        for(int i = 0; i<=n-4; i++){
            for(int j=i+1; j<=n-3; j++){
                for(int k = j+1; k<=n-2; k++){
                    for(int l = k+1; l<=n-1;l++){
                        if(nums[i] + nums[j] + nums[k] == nums[l]){
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
