// 167. Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-15 01:01:42
// Runtime:    2 ms (beats 96.07%)
// Memory:     48.1 MB (beats 95.12%)
// Topics:     Array, Two Pointers, Binary Search

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n= numbers.length;


        int left =0;
        int right = n-1;


        while(left < right){

            if(numbers[left] + numbers[right] == target){
                return new int[] {left+1, right+1};
            }else if(numbers[left] + numbers[right]  > target){
                right--;
            }else{
                left++;
            }

        }

        return new int[] {-1,-1};

        
    }
}
