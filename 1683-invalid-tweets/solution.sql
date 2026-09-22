-- 1683. Invalid Tweets
-- https://leetcode.com/problems/invalid-tweets/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-07-11 04:42:00
-- Runtime:    608 ms (beats 80.35%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select tweet_id from Tweets where length(content) > 15;
