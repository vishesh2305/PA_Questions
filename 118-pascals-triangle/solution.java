// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-08-04 20:18:42
// Runtime:    1 ms (beats 95.42%)
// Memory:     43.4 MB (beats 71.10%)
// Topics:     Array, Dynamic Programming

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> answer = new ArrayList<>();

        for(int i=0; i<numRows; i++){

            List<Integer> row = new ArrayList<>();

            for(int j=0; j<=i; j++){
                
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(answer.get(i-1).get(j-1)+ answer.get(i-1).get(j));
                }

            }
            answer.add(row);
        }
        return answer;
        
    }
}
