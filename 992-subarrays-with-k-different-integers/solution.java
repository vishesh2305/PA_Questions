// 992. Subarrays with K Different Integers
// https://leetcode.com/problems/subarrays-with-k-different-integers/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-11-19 14:01:17
// Runtime:    48 ms (beats 73.90%)
// Memory:     49.7 MB (beats 60.03%)
// Topics:     Array, Hash Table, Sliding Window, Counting

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostk(nums, k) - atMostk(nums, k-1);
    }

    private int atMostk(int[] nums, int k){
        if(k <= 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;

        for(int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

            while(map.size() > k){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }

            count += right - left + 1;
        } 
        return count;
    }
}
