// 2053. Kth Distinct String in an Array
// https://leetcode.com/problems/kth-distinct-string-in-an-array/
// Difficulty: Easy
// Language:   C++
// Submitted:  2026-01-04 23:52:44
// Runtime:    0 ms (beats 100.00%)
// Memory:     18.3 MB (beats 81.11%)
// Topics:     Array, Hash Table, String, Counting

class Solution {
public:
    string kthDistinct(vector<string>& arr, int k) {
        unordered_map<string, int> freq;
        for(auto i: arr){
            freq[i]++;
        };


        for(int i=0; i<arr.size(); i++){
            if(freq[arr[i]] == 1){
                k--;
                if(k==0){
                    return arr[i];
                }
            }
        }

        return "";

    }
};
