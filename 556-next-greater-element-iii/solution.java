// 556. Next Greater Element III
// https://leetcode.com/problems/next-greater-element-iii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-24 12:12:01
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.1 MB (beats 59.39%)
// Topics:     Math, Two Pointers, String

class Solution {
    public int nextGreaterElement(int n) {

        if (n < 10)
            return -1;

        char[] digits = String.valueOf(n).toCharArray();

        int L = digits.length;
        int i = L - 2;

        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if(i < 0) return -1;

        for (int j = L - 1; j > i; j--) {
            if (digits[j] > digits[i]) {
                char temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
                break;
            }
        }

        int left = i + 1;
        int right = L - 1;

        while (left < right) {
            char temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;
            left++;
            right--;
        }

        long result = Long.parseLong(String.valueOf(digits));

        if(result > Integer.MAX_VALUE){
            return -1;
        }
        return (int)result;

    }
}
