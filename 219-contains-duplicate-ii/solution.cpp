// 219. Contains Duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/
// Difficulty: Easy
// Language:   C++
// Submitted:  2026-01-03 14:40:41
// Runtime:    64 ms (beats 99.77%)
// Memory:     98.7 MB (beats 99.65%)
// Topics:     Array, Hash Table, Sliding Window

class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {

        unordered_map<int, int> freq;

        for (int i = 0; i < nums.size(); i++) {
            if(freq.count(nums[i])){
                if(i-freq[nums[i]] <= k){
                    return true;
                }
            }
            freq[nums[i]] = i;
        };
        return false;



    }
};
