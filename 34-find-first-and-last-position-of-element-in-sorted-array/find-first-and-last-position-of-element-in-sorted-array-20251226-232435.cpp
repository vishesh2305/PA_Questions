// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Difficulty: Medium
// Language:   C++
// Submitted:  2025-12-26 23:24:35
// Runtime:    0 ms (beats 100.00%)
// Memory:     17.7 MB (beats 17.28%)
// Topics:     Array, Binary Search

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {


        int first = BinarySearch(nums, target, true);
        int last = BinarySearch(nums, target, false);

        return {first, last};


        
    }

    int BinarySearch(vector<int>& nums, int target, bool first){

        int low = 0;
        int high = nums.size()-1;
        int ans = -1;

        while(high>=low){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                ans = mid;

                if(first){
                    high = mid-1;
                }else{
                    low = mid+1;
                }

            }else if(nums[mid] < target){

                low = mid+1;

            }else{
                high = mid-1;
            }

        }

        return ans;

    }

};
