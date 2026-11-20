// 76. Minimum Window Substring
// https://leetcode.com/problems/minimum-window-substring/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-11-18 20:59:47
// Runtime:    20 ms (beats 35.34%)
// Memory:     47.1 MB (beats 32.63%)
// Topics:     Hash Table, String, Sliding Window

class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";


        HashMap<Character, Integer> targetMap = new HashMap<>();

        HashMap<Character, Integer> windowMap = new HashMap<>();

        for(char ch : t.toCharArray()){
            targetMap.put(ch, targetMap.getOrDefault(ch , 0)+1);
        }

        int required = targetMap.size();


        int formed = 0;

        int left = 0;
        
        int minlen = Integer.MAX_VALUE;

        int start = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0)+1);

            if(targetMap.containsKey(ch) && windowMap.get(ch).intValue() == targetMap.get(ch).intValue()){
                formed++;

            }

            while(formed == required){
                int currlength = right - left + 1;

                if(currlength < minlen){
                    minlen = currlength;
                    start = left;
                }



            

            char leftChar = s.charAt(left);

            windowMap.put(leftChar, windowMap.get(leftChar)-1);

            if(targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)){
                formed--;
            }

            left++;

            }

        }

        if(minlen == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start, start + minlen);
    }
}
