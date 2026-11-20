// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-20 11:03:00
// Runtime:    8 ms (beats 93.62%)
// Memory:     49 MB (beats 39.79%)
// Topics:     Array, Sorting, Quicksort

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        for(int[] interval : intervals){
            if(result.isEmpty() || result.getLast()[1] < interval[0]){
                result.add(interval);
            }else{
                result.getLast()[1] = Math.max(interval[1], result.getLast()[1]);
            }
        }


        return result.toArray(new int[result.size()][]);

    }
}
