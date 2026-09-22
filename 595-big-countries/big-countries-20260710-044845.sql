-- 595. Big Countries
-- https://leetcode.com/problems/big-countries/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-07-10 04:48:45
-- Runtime:    272 ms (beats 98.11%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select name , population, area from World where population >= 25000000 or area >= 3000000;
