// 198. House Robber
// https://leetcode.com/problems/house-robber/
// Difficulty: Medium
// Language:   C++
// Submitted:  2026-01-09 12:41:25
// Runtime:    0 ms (beats 100.00%)
// Memory:     10.1 MB (beats 79.22%)
// Topics:     Array, Dynamic Programming

class Solution {
public:
    int rob(vector<int>& arr) {
        int n = arr.size();
        if(n==0) return 0;
        if(n==1) return arr[0];

        int prevPrev = arr[0];
        int prev = max(arr[0], arr[1]);

        for(int i=2; i<n; i++){
            int take = prevPrev+ arr[i];
            int skip = prev;

            int currentbest = max(take, skip);

            prevPrev = prev;
            prev = currentbest;
        };

        return prev;

    }
};
