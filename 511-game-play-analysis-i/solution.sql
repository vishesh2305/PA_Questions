-- 511. Game Play Analysis I
-- https://leetcode.com/problems/game-play-analysis-i/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-02-16 19:24:54
-- Runtime:    470 ms (beats 94.81%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

SELECT player_id, min(event_date) AS "first_login" from Activity group by player_id;
