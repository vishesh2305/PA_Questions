-- 176. Second Highest Salary
-- https://leetcode.com/problems/second-highest-salary/
-- Difficulty: Medium
-- Language:   MySQL
-- Submitted:  2026-05-28 21:39:30
-- Runtime:    305 ms (beats 53.23%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

SELECT (
    Select distinct(salary) from Employee Order by salary desc limit 1 offset 1
) as SecondHighestSalary;
