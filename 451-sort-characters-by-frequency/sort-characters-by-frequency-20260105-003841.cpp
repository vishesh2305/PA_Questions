// 451. Sort Characters By Frequency
// https://leetcode.com/problems/sort-characters-by-frequency/
// Difficulty: Medium
// Language:   C++
// Submitted:  2026-01-05 00:38:41
// Runtime:    3 ms (beats 54.28%)
// Memory:     11.3 MB (beats 36.73%)
// Topics:     Hash Table, String, Sorting, Heap (Priority Queue), Bucket Sort, Counting

class Solution {
public:
    string frequencySort(string s) {

        unordered_map<char,int>freq;

        for(auto i:s){
            freq[i]++;
        };

        vector<pair<char,int>> v(freq.begin(), freq.end());

        sort(v.begin(), v.end(), [](auto &a, auto &b){
            return a.second > b.second;
        });

        string result="";
        for(auto &p : v){
            result.append(p.second, p.first);
        }

        return result;
        
    }
};
