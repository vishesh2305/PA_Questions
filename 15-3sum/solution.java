// 15. 3Sum
// https://leetcode.com/problems/3sum/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-24 23:35:35
// Runtime:    37 ms (beats 26.57%)
// Memory:     59.2 MB (beats 31.35%)
// Topics:     Array, Two Pointers, Sorting

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> sub_list = new ArrayList<>();
                    result.add(List.of(nums[i], nums[left], nums[right]));

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
