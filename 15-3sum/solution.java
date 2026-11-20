// 15. 3Sum
// https://leetcode.com/problems/3sum/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-17 00:31:53
// Runtime:    34 ms (beats 62.22%)
// Memory:     58.9 MB (beats 57.20%)
// Topics:     Array, Two Pointers, Sorting

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(i > 0 && nums[i-1] == nums[i]) continue;
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> sub = new ArrayList<>();

                    result.add(List.of(nums[left], nums[right], nums[i]));

                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }

                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return result;
    }
}
