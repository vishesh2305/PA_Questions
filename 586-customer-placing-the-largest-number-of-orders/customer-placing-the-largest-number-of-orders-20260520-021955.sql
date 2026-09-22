-- 586. Customer Placing the Largest Number of Orders
-- https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-05-20 02:19:55
-- Runtime:    522 ms (beats 51.87%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

# Write your MySQL query statement below
select customer_number from Orders group by customer_number order by Count(*) desc limit 1;
