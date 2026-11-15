// 1971. Find if Path Exists in Graph
// https://leetcode.com/problems/find-if-path-exists-in-graph/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-15 12:13:46
// Runtime:    155 ms (beats 33.46%)
// Memory:     276.4 MB (beats 81.31%)
// Topics:     Depth-First Search, Breadth-First Search, Union-Find, Graph Theory

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int x = edge[0];
            int y = edge[1];

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        boolean[] visited = new boolean[n];

        return helper(graph, visited, source, destination);

    }

    private static boolean helper(List<List<Integer>> graph, boolean[] visited, int current, int destination){
        if(current == destination) return true;

        visited[current] = true;

        for(int neigh : graph.get(current)){
            if(!visited[neigh]){
                if(helper(graph, visited, neigh, destination)){
                    return true;
                }
            }
        }

        return false;
    }
}
