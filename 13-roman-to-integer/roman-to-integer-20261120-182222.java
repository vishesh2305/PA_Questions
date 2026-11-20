// 13. Roman to Integer
// https://leetcode.com/problems/roman-to-integer/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-20 18:22:22
// Runtime:    7 ms (beats 25.49%)
// Memory:     46 MB (beats 76.67%)
// Topics:     Hash Table, Math, String

class Solution {
    public int romanToInt(String s) {
        int result = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            int val = map.get(c);

            if(i < n-1 && map.get(s.charAt(i+1)) > val){
                result-=val;
            }else{
            result += val;
            };
        }

        return result;

    }
}
