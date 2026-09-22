// 384. Shuffle an Array
// https://leetcode.com/problems/shuffle-an-array/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-28 04:18:30
// Runtime:    50 ms (beats 77.93%)
// Memory:     52.1 MB (beats 82.88%)
// Topics:     Array, Math, Design, Randomized

class Solution {

    private int[] original;
    Random rand;
    // private int[] current;

    public Solution(int[] nums) {
        // this.original = new int[nums.length];
        // this.current = new int[nums.length];
        original = nums.clone();
        rand = new Random();

        // for(int i=0; i<nums.length; i++){
        //     current[i] = original[i] = nums[i];
        // }

        
    }
    
    public int[] reset() {
        

        // for(int i=0; i<current.length; i++){
        //     current[i] = original[i];
        // }
        // return current;
        return original.clone();

    }
    
    public int[] shuffle() {

        int[] arr = original.clone();
        for(int i=0; i<arr.length; i++){
            int j= i+rand.nextInt(arr.length-i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
