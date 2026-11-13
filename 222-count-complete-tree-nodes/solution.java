// 222. Count Complete Tree Nodes
// https://leetcode.com/problems/count-complete-tree-nodes/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-13 12:20:48
// Runtime:    0 ms (beats 100.00%)
// Memory:     48.6 MB (beats 97.87%)
// Topics:     Binary Search, Bit Manipulation, Tree, Binary Tree

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
    private int leftheight(TreeNode root){
        int height =0;
        while(root != null){
            height++;
            root = root.left;
        }

        return height;
    }
    private int rightheight(TreeNode root){
        int height =0;
        while(root != null){
            height++;
            root = root.right;
        }

        return height;
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int lh = leftheight(root);
        int rh = rightheight(root);

        if(lh == rh){
            return (int) Math.pow(2, lh) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
