# 33. Search in Rotated Sorted Array

**Difficulty:** Medium  
**Link:** [https://leetcode.com/problems/search-in-rotated-sorted-array/](https://leetcode.com/problems/search-in-rotated-sorted-array/)  
**Topics:** `Array`, `Binary Search`  
**Acceptance:** 45.7%

---

There is an integer array `nums` sorted in ascending order (with **distinct** values).

Prior to being passed to your function, `nums` is **possibly left rotated** at an unknown index `k` (`1 Given the array `nums` **after** the possible rotation and an integer `target`, return _the index of _`target`_ if it is in _`nums`_, or _`-1`_ if it is not in _`nums`.

You must write an algorithm with `O(log n)` runtime complexity.

 

Example 1:**

```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```
Example 2:**

```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
```
Example 3:**

```
Input: nums = [1], target = 0
Output: -1
```

 

**Constraints:**

	
- `1 <= nums.length <= 5000`
	
- `-104 <= nums[i] <= 104`
	
- All values of `nums` are **unique**.
	
- `nums` is an ascending array that is possibly rotated.
	
- `-104 <= target <= 104`

---

<sub>Synced by LeetHub Sync.</sub>
