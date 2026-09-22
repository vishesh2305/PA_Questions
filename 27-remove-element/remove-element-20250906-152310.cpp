// 27. Remove Element
// https://leetcode.com/problems/remove-element/
// Difficulty: Easy
// Language:   C++
// Submitted:  2025-09-06 15:23:10
// Runtime:    0 ms (beats 100.00%)
// Memory:     11.7 MB (beats 48.86%)
// Topics:     Array, Two Pointers

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int len = nums.size();

        int i=0;
        int j =0;
        while(i < len){
            if(nums[i] == val && i != len-1){
                j = i;
                while(j < len-1 && j!= len-1){
                    nums[j] = nums[j+1];
                    j++;
                }
                len--;
                i--;
            }else if(nums[i] == val && i == len-1){
                len--;
            }
            i++;
        }
        return len;
    }

};
