// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-02 15:46:48
// Runtime:    8 ms (beats 89.71%)
// Memory:     48.9 MB (beats 85.01%)
// Topics:     Array, Sorting, Quicksort

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] interval : intervals){
            if(merged.isEmpty() || (merged.getLast()[1] < interval[0])){
                merged.add(interval);
            }else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
        
    }
}
