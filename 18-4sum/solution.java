// 18. 4Sum
// https://leetcode.com/problems/4sum/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-27 18:39:29
// Runtime:    17 ms (beats 91.45%)
// Memory:     45.2 MB (beats 76.33%)
// Topics:     Array, Two Pointers, Sorting

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int left = j+1; 
                int right = n-1;

                while(left < right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target){
                        result.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        while(left < right && nums[left] == nums[left-1]){
                            left++;
                        }

                        while(left < right && nums[right] == nums[right+1]){
                            right--;
                        }
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
