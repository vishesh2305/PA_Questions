// 841. Keys and Rooms
// https://leetcode.com/problems/keys-and-rooms/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-15 01:20:59
// Runtime:    2 ms (beats 53.38%)
// Memory:     45.9 MB (beats 72.73%)
// Topics:     Depth-First Search, Breadth-First Search, Graph Theory

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int len = rooms.size();
        if(len == 1) return true;
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[len];
        for(int i : rooms.get(0)){
            st.add(i);
        }
        visited[0] = true;

        helper(rooms, visited, st);

        for(int i=0; i<len; i++){
            if(visited[i] == false){
                return false;
            }
        }

        return true;

    }

    private void helper(List<List<Integer>> rooms, boolean[] visited, Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        while(!st.isEmpty() && visited[st.peek()]){
            st.pop();
        }
        if(st.isEmpty()) return;
        int index = st.pop();
        visited[index] = true;

        for(int i : rooms.get(index)){
            if(!visited[i]){
            st.add(i);
            }
        };

        helper(rooms, visited, st);
    }

}
