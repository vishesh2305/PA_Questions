// 735. Asteroid Collision
// https://leetcode.com/problems/asteroid-collision/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-17 12:51:45
// Runtime:    4 ms (beats 77.80%)
// Memory:     46.4 MB (beats 82.15%)
// Topics:     Array, Stack, Simulation

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty() && i < 0 && st.peek() > 0) {
                int num = st.peek();

                if (num < Math.abs(i)) {
                    st.pop();
                } else if (num == Math.abs(i)) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if(!destroyed){
                st.push(i);
            }
        }
        int[] result = new int[st.size()];
        for (int i = result.length-1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}
