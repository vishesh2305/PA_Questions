// 76. Minimum Window Substring
// https://leetcode.com/problems/minimum-window-substring/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-08-27 04:51:55
// Runtime:    20 ms (beats 37.58%)
// Memory:     47.9 MB (beats 18.72%)
// Topics:     Hash Table, String, Sliding Window

class Solution {
    public String minWindow(String s, String t) {

        if(s=="" || t==""){
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();

        for(char c : t.toCharArray()){
            need.put(c, need.getOrDefault(c, 0)+1);
        }

        int required = need.size();

        int BestLen = Integer.MAX_VALUE;
        int BestLeft =0;
        int left =0;
        int have =0;

        Map<Character, Integer> window = new HashMap<>();

        for(int right =0; right < s.length(); right++){
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch,0)+1);

            if(need.containsKey(ch) && need.get(ch).intValue() == window.get(ch).intValue()){
                have++;
            }

            while(required==have){
                if(right-left+1 < BestLen){
                    BestLen = right-left+1;
                    BestLeft = left;
                }
                char l = s.charAt(left);
                window.put(l, window.get(l)-1);
                if(need.containsKey(l) && window.get(l) < need.get(l)){
                    have--;
                }
                left++;
            }
        }

        if(BestLen == Integer.MAX_VALUE) return "";

        return s.substring(BestLeft, BestLeft+BestLen);
        
    }
}
