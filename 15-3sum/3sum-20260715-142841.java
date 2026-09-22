// 15. 3Sum
// https://leetcode.com/problems/3sum/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-15 14:28:41
// Runtime:    29 ms (beats 92.81%)
// Memory:     59.1 MB (beats 59.81%)
// Topics:     Array, Two Pointers, Sorting

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = n-1;
            int fixed = nums[i];
            while(l < r){
                int sum = fixed+nums[l]+nums[r];
                if(sum == 0){
                    result.add(List.of(fixed, nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]) l++;
                    while(l < r && nums[r] == nums[r+1]) r--;
                }else if(sum > 0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return result;
        
    }
}
