-- 183. Customers Who Never Order
-- https://leetcode.com/problems/customers-who-never-order/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-02-16 19:20:29
-- Runtime:    614 ms (beats 59.70%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

SELECT Customers.name as Customers from Customers LEFT JOIN Orders on Customers.id = Orders.customerId where orders.customerId is Null;
