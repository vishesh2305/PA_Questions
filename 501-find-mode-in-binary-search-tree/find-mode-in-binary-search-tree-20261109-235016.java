// 501. Find Mode in Binary Search Tree
// https://leetcode.com/problems/find-mode-in-binary-search-tree/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-09 23:50:16
// Runtime:    14 ms (beats 5.20%)
// Memory:     45.3 MB (beats 100.00%)
// Topics:     Tree, Depth-First Search, Binary Search Tree, Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeMap<Integer, Integer> map = new TreeMap<>();
    public int[] findMode(TreeNode root) {
        travel(root);

        int maxKeyCount = 0;

        for(int count : map.values()){
            if(count > maxKeyCount){
                maxKeyCount = count;
            }
        }

        List<Integer> mynodelist = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == maxKeyCount){
                mynodelist.add(entry.getKey());
            }
        }

        int[] result = new int[mynodelist.size()];

        for(int i=0; i<result.length; i++){
            result[i] = mynodelist.get(i);
        }

        return result;

    }
    private void travel(TreeNode root){
        if(root==null) return;

        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        travel(root.left);
        travel(root.right);
    }
}
