-- 1068. Product Sales Analysis I
-- https://leetcode.com/problems/product-sales-analysis-i/
-- Difficulty: Easy
-- Language:   MySQL
-- Submitted:  2026-05-20 22:26:24
-- Runtime:    1268 ms (beats 77.15%)
-- Memory:     0B (beats 100.00%)
-- Topics:     Database

select p.product_name, s.year, s.price from Sales s JOIN Product p on s.product_id = p.product_id;
