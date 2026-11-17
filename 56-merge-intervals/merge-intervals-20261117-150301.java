// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-17 15:03:01
// Runtime:    12 ms (beats 8.48%)
// Memory:     48.6 MB (beats 69.39%)
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
