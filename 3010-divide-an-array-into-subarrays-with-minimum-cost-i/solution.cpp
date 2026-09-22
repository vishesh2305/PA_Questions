// 3010. Divide an Array Into Subarrays With Minimum Cost I
// https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/
// Difficulty: Easy
// Language:   C++
// Submitted:  2026-02-02 01:18:30
// Runtime:    0 ms (beats 100.00%)
// Memory:     30.4 MB (beats 75.16%)
// Topics:     Array, Sorting, Enumeration

class Solution {
public:
    int minimumCost(vector<int>& nums) {
        long int sum =0;
        if(nums.size() <= 3){
            for(auto i: nums){
                sum+=i;
            };
        }else{
            sum+=nums[0];
            int firstsmall=INT_MAX;
            int secondsmall=INT_MAX;
            for(int i=1;i<nums.size(); i++){
                if(nums[i] <= firstsmall){
                    secondsmall = firstsmall;
                    firstsmall = nums[i];
                }else if(nums[i] < secondsmall){
                    secondsmall = nums[i];
                }
            }
            sum+= firstsmall;
            sum+=secondsmall;
        }


        return sum;

    }
};
