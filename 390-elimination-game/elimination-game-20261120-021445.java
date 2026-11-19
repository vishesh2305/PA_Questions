// 390. Elimination Game
// https://leetcode.com/problems/elimination-game/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-20 02:14:45
// Runtime:    4 ms (beats 50.82%)
// Memory:     42.6 MB (beats 94.18%)
// Topics:     Math, Recursion

class Solution {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int remaining = n;

        boolean lefttoright = true;

        while(remaining > 1){
            if(lefttoright || remaining % 2 == 1){
                head += step;
            }

            remaining /= 2;
            step *= 2;
            lefttoright = !lefttoright;
        }

        return head;
    }
}
