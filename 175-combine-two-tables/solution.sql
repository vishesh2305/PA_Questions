-- 175. Combine Two Tables
-- https://leetcode.com/problems/combine-two-tables/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-07-10 04:32:28
-- Runtime:    413 ms (beats 85.14%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
SELECT firstName, lastName, a.city, a.state FROM person p LEFT JOIN Address a ON p.personId = a.personId;
