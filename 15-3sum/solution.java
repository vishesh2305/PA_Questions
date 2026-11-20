// 15. 3Sum
// https://leetcode.com/problems/3sum/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-21 01:03:39
// Runtime:    33 ms (beats 71.61%)
// Memory:     59.7 MB (beats 15.59%)
// Topics:     Array, Two Pointers, Sorting

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    List<Integer> sub_list = new ArrayList<>();

                    sub_list.add(nums[i]);
                    sub_list.add(nums[left]);
                    sub_list.add(nums[right]);
                    result.add(sub_list);

                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }

                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else{
                    if(sum < 0){
                        left++;
                    }else{
                        right--;
                    }
                };
            }

        }

        return result;

    }
}
