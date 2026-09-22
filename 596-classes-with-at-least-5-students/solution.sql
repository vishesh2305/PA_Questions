-- 596. Classes With at Least 5 Students
-- https://leetcode.com/problems/classes-with-at-least-5-students/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-05-20 02:26:49
-- Runtime:    334 ms (beats 79.46%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select class from Courses group by class having count(student)>=5;
