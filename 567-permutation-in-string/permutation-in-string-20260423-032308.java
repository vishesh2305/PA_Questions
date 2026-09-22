// 567. Permutation in String
// https://leetcode.com/problems/permutation-in-string/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-23 03:23:08
// Runtime:    5 ms (beats 97.39%)
// Memory:     44.2 MB (beats 48.46%)
// Topics:     Hash Table, Two Pointers, String, Sliding Window

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();

        int n2 = s2.length();

        int[] arr = new int[26];

        for(int i=0; i<n1; i++){
            arr[s1.charAt(i) - 'a']++;
        }

        int left =0;

        int count = n1;

        for(int right =0; right<n2; right++){

            char ch = s2.charAt(right);

            arr[ch - 'a']--;

            if(arr[ch-'a'] >= 0){
                count--;
            }

            if(right - left + 1 > n1){

                char leftChar = s2.charAt(left);

                if(arr[leftChar - 'a'] >=0){
                    count++;
                }

                arr[leftChar-'a']++;
                left++;
            }
            if(count == 0) return true;

        }

        return false;
        
    }
}
