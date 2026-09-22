-- 197. Rising Temperature
-- https://leetcode.com/problems/rising-temperature/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-05-21 00:31:06
-- Runtime:    494 ms (beats 71.19%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

select w1.id from Weather w1 JOIN Weather w2 ON 
DATEDIFF(w1.recordDate, w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;
