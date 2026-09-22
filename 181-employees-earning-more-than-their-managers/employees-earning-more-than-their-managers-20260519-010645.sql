-- 181. Employees Earning More Than Their Managers
-- https://leetcode.com/problems/employees-earning-more-than-their-managers/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-05-19 01:06:45
-- Runtime:    388 ms (beats 81.27%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select e.name as Employee from Employee e
JOIN Employee m ON e.managerId = m.id
WHERE
e.salary > m.salary;
