# 1757. Recyclable and Low Fat Products
# https://leetcode.com/problems/recyclable-and-low-fat-products/
# Difficulty: Easy
# Language:   Pandas
# Submitted:  2026-08-04 18:13:25
# Runtime:    313 ms (beats 32.58%)
# Memory:     66.7 MB (beats 99.02%)
# Topics:     Database

import pandas as pd

def find_products(products: pd.DataFrame) -> pd.DataFrame:
    result = products[(products['low_fats'] == 'Y') & (products['recyclable'] == 'Y')][['product_id']]

    return result
