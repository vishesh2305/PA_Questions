// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-17 14:55:03
// Runtime:    10 ms (beats 20.78%)
// Memory:     48.7 MB (beats 69.39%)
// Topics:     Array, Sorting, Quicksort

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int[] curr_interval = intervals[0];
        result.add(curr_interval);

        for(int i=1; i<intervals.length; i++){

            int currEnd = curr_interval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if(currEnd >= nextStart){
                curr_interval[1] = Math.max(currEnd, nextEnd);
            }else{
                curr_interval = intervals[i];
                result.add(curr_interval);
            }
        }

        return result.toArray(new int[result.size()][]);
        
    }
}
