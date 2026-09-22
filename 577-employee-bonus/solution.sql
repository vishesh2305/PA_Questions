-- 577. Employee Bonus
-- https://leetcode.com/problems/employee-bonus/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-07-10 04:42:25
-- Runtime:    1159 ms (beats 43.44%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
SELECT e.name, b.bonus from Employee e LEFT JOIN Bonus b ON b.empId=e.empId HAVING b.bonus < 1000 or b.bonus is null;
