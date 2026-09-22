-- 182. Duplicate Emails
-- https://leetcode.com/problems/duplicate-emails/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-05-19 01:11:05
-- Runtime:    394 ms (beats 74.05%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select email as Email from Person group by email 
Having
Count(email) > 1;
