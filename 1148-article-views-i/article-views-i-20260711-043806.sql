-- 1148. Article Views I
-- https://leetcode.com/problems/article-views-i/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-07-11 04:38:06
-- Runtime:    363 ms (beats 99.80%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select Distinct author_id as id from Views Where author_id = viewer_id Order by author_id ASC;
