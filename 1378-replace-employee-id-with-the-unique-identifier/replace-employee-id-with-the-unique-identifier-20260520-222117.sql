-- 1378. Replace Employee ID With The Unique Identifier
-- https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-05-20 22:21:17
-- Runtime:    1213 ms (beats 82.78%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select  u.unique_id AS unique_id , e.name AS name from Employees e LEFT JOIN EmployeeUNI u on e.id = u.id ORDER BY name;
