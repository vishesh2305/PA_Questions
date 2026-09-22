// 278. First Bad Version
// https://leetcode.com/problems/first-bad-version/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-19 01:45:15
// Runtime:    14 ms (beats 49.52%)
// Memory:     42 MB (beats 72.81%)
// Topics:     Binary Search, Interactive

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }
    private int binarySearch(int left, int right){
        if(left > right) return left;

        int mid = left + (right - left)/2;
        if(isBadVersion(mid)){
            return binarySearch(left, mid-1);
        }else{
            return binarySearch(mid+1, right);
        }
    }
}
