// 1971. Find if Path Exists in Graph
// https://leetcode.com/problems/find-if-path-exists-in-graph/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-15 12:03:11
// Runtime:    149 ms (beats 38.46%)
// Memory:     276.7 MB (beats 81.00%)
// Topics:     Depth-First Search, Breadth-First Search, Union-Find, Graph Theory

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);

            graph.get(v).add(u);

        }

        boolean[] visited = new boolean[n];

        return helper(graph, visited, source, destination);
    }

    static private boolean helper(List<List<Integer>> graph,boolean[] visited, int current, int dest){
        if(current == dest) return true;

        visited[current] = true;

        for(int neigh : graph.get(current)){
            if(!visited[neigh]){
                if(helper(graph, visited, neigh, dest)){
                    return true;
                }
                
            }
        }


        return false;


    }
}
