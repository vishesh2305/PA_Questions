# 76. Minimum Window Substring

**Difficulty:** Hard  
**Link:** [https://leetcode.com/problems/minimum-window-substring/](https://leetcode.com/problems/minimum-window-substring/)  
**Topics:** `Hash Table`, `String`, `Sliding Window`  
**Acceptance:** 48.5%

---

Given two strings `s` and `t` of lengths `m` and `n` respectively, return _the **minimum window**_ **_substring_**_ of _`s`_ such that every character in _`t`_ (**including duplicates**) is included in the window_. If there is no such substring, return _the empty string _`""`.

The testcases will be generated such that the answer is **unique**.

 

Example 1:**

```
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
```

Example 2:**

```
Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
```

Example 3:**

```
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
```

 

**Constraints:**

	
- `m == s.length`
	
- `n == t.length`
	
- `1  

**Follow up:** Could you find an algorithm that runs in `O(m + n)` time?

---

<sub>Synced by LeetHub Sync.</sub>
