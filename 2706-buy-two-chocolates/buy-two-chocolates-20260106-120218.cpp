// 2706. Buy Two Chocolates
// https://leetcode.com/problems/buy-two-chocolates/
// Difficulty: Easy
// Language:   C++
// Submitted:  2026-01-06 12:02:18
// Runtime:    0 ms (beats 100.00%)
// Memory:     52.1 MB (beats 62.43%)
// Topics:     Array, Greedy, Sorting

class Solution {
public:
    int buyChoco(vector<int>& prices, int money) {
    if(money==0) return 0;
    sort(prices.begin(), prices.end());

    if(prices[0] + prices[1] <= money){
        return money-(prices[0]+prices[1]);
    }else{
        return money;
    }


        
    }
};
