-- 1729. Find Followers Count
-- https://leetcode.com/problems/find-followers-count/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-02-24 10:57:32
-- Runtime:    506 ms (beats 97.72%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below

SELECT user_id , COUNT(USER_id) AS followers_count from Followers GROUP BY user_id ORDER BY user_id ASC;
