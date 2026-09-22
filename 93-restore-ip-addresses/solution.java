// 93. Restore IP Addresses
// https://leetcode.com/problems/restore-ip-addresses/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-09 03:22:26
// Runtime:    5 ms (beats 40.95%)
// Memory:     46.6 MB (beats 42.46%)
// Topics:     String, Backtracking

class Solution {
    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        helper(s, 0, 0, new StringBuilder());
        return result;
    }

    private void helper(String s, int index, int segmentcount, StringBuilder sb) {
        if (segmentcount == 4 && index == s.length()) {
            result.add(sb.toString());
            return;
        }

        for (int i = 1; i <= 3 && index + i <= s.length(); i++) {
            String segment = s.substring(index, index + i);

            if (!(segment.length() > 1 && segment.charAt(0) == '0') && Integer.parseInt(segment) <= 255) {
                int originalLength = sb.length();
                if (segmentcount > 0) {
                    sb.append(".");
                }
                ;
                sb.append(segment);

                helper(s, index + i, segmentcount + 1, sb);
                sb.setLength(originalLength);
            }

        }
    }
}
