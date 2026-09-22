// 1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/
// Difficulty: Easy
// Language:   C++
// Submitted:  2025-12-23 01:04:15
// Runtime:    0 ms (beats 100.00%)
// Memory:     13.4 MB (beats 52.24%)
// Topics:     Array

class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {


        int len = nums.size();

        vector<int> result;

        int i=0; 
        int j=n;

        while(j != len){
            result.push_back(nums[i]);
            result.push_back(nums[j]);
            j++;
            i++;
        }


        return result;
        
    }
};
