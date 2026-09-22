# 153. Find Minimum in Rotated Sorted Array
# https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
# Difficulty: Medium
# Language:   Python
# Submitted:  2026-06-23 11:06:40
# Runtime:    0 ms (beats 100.00%)
# Memory:     12.4 MB (beats 96.92%)
# Topics:     Array, Binary Search

class Solution(object):
    def findMin(self, nums):
        l = len(nums)
        left = 0
        right = l-1

        while left < right:
            mid = left + (right-left)/2

            if(nums[mid] > nums[right]):
                left = mid+1
            else:
                right = mid
                
        return nums[left]

        """
        :type nums: List[int]
        :rtype: int
        """
        
