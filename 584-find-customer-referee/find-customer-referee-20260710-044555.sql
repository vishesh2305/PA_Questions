-- 584. Find Customer Referee
-- https://leetcode.com/problems/find-customer-referee/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-07-10 04:45:55
-- Runtime:    482 ms (beats 85.58%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select name from Customer where referee_id is null or referee_id != 2;
