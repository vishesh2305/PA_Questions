// 69. Sqrt(x)
// https://leetcode.com/problems/sqrtx/
// Difficulty: Easy
// Language:   C++
// Submitted:  2025-12-29 00:01:37
// Runtime:    0 ms (beats 100.00%)
// Memory:     8.4 MB (beats 86.82%)
// Topics:     Math, Binary Search, Newton's Method

class Solution {
public:
    int mySqrt(int x) {

        if(x==0) return x;
        int ans =1 ;

        int low = 1; int high = x; // x = 4

        while(low <= high){
            double mid = low + (high - low)/2; // for x = 4 -> 2

            if(mid*mid == x){
                ans=mid;
                break;
            }

            if(mid*mid < x){  // mid*mid = x;
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;
        
    }
};
