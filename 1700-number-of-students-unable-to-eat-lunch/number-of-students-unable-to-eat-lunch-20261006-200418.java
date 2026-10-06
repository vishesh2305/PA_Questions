// 1700. Number of Students Unable to Eat Lunch
// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-10-06 20:04:18
// Runtime:    2 ms (beats 49.16%)
// Memory:     43.5 MB (beats 25.87%)
// Topics:     Array, Stack, Queue, Simulation

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new LinkedList<>();

        for(int st: students){
            q.add(st);
        };

        int si =0;
        int rot =0;
        while(!q.isEmpty() && rot < q.size()){
            if(q.peek() == sandwiches[si]){
                q.poll();
                si++;
                rot =0;
            }else{
                q.add(q.poll());
                rot++;
            }
        };

        return q.size();



    }
}
