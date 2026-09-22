// 997. Find the Town Judge
// https://leetcode.com/problems/find-the-town-judge/
// Difficulty: Easy
// Language:   C++
// Submitted:  2026-01-02 00:10:42
// Runtime:    32 ms (beats 26.38%)
// Memory:     73.1 MB (beats 34.85%)
// Topics:     Array, Hash Table, Graph Theory

class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {

        // if(n==1) return 1;

        vector<int>Scores(n+1,0);
        
        for(auto i:trust){
            Scores[i[0]]--;
            Scores[i[1]]++;
        }

        for(int i=1; i<=n; i++){
            if(Scores[i] == n-1){
                return i;
            }
        }

        return -1;
        
    }
};
