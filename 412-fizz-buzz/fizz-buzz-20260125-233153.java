// 412. Fizz Buzz
// https://leetcode.com/problems/fizz-buzz/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-01-25 23:31:53
// Runtime:    1 ms (beats 99.82%)
// Memory:     47.1 MB (beats 11.14%)
// Topics:     Math, String, Simulation

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
            }else if(i%3==0){
                arr.add("Fizz");
            }else if(i%5==0){
                arr.add("Buzz");
            }else{
                arr.add(String.valueOf(i));
            }
        }

        return arr;

    }
}
