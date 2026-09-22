-- 1581. Customer Who Visited but Did Not Make Any Transactions
-- https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-05-21 00:13:52
-- Runtime:    1411 ms (beats 75.80%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

SELECT v.customer_id, count(*) as count_no_trans from Visits v LEFT JOIN Transactions t ON v.visit_id = t.visit_id
where transaction_id is null group by v.customer_id;
