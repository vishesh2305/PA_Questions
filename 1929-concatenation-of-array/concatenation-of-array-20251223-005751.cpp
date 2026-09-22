// 1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/
// Difficulty: Easy
// Language:   C++
// Submitted:  2025-12-23 00:57:51
// Runtime:    0 ms (beats 100.00%)
// Memory:     16.9 MB (beats 59.84%)
// Topics:     Array, Simulation

class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {

        int n = nums.size();
        
        vector<int> ans(2*n);


        for(int i=0; i<n; i++){
            ans[i] = nums[i];
        }

        for(int j = n; j<(2*n); j++){
            ans[j] = nums[j-n];
        }

        return ans;
        


        
    }
};
