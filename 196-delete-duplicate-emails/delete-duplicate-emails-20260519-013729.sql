-- 196. Delete Duplicate Emails
-- https://leetcode.com/problems/delete-duplicate-emails/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-05-19 01:37:29
-- Runtime:    614 ms (beats 94.82%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
delete from Person
where id not in (
    select keepId from (
        select min(id) as keepId from Person
        group by email
    ) as t
);
