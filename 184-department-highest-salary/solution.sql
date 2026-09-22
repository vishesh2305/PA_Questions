-- 184. Department Highest Salary
-- https://leetcode.com/problems/department-highest-salary/
-- Difficulty: Medium
-- Language:   MySQL
-- Submitted:  2026-05-28 21:58:58
-- Runtime:    746 ms (beats 68.69%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary from Employee e Join Department d on d.id = e.departmentId
where e.salary = (Select Max(salary) from Employee where d.id = departmentId);
