// 16. 3Sum Closest
// https://leetcode.com/problems/3sum-closest/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-17 11:29:49
// Runtime:    19 ms (beats 23.35%)
// Memory:     44.9 MB (beats 83.49%)
// Topics:     Array, Two Pointers, Sorting

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for(int i=0; i<nums.length-1; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[left]+nums[right] + nums[i];

                if(Math.abs(target - sum) < Math.abs(target - closest)){
                    closest = sum;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return closest;
    }
}
