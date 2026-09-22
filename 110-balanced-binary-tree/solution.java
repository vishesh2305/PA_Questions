// 110. Balanced Binary Tree
// https://leetcode.com/problems/balanced-binary-tree/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-25 00:24:45
// Runtime:    0 ms (beats 100.00%)
// Memory:     45.6 MB (beats 42.02%)
// Topics:     Tree, Depth-First Search, Binary Tree

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
    boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        height(root);

        return flag;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(right-left) > 1){
            flag = false;
            return 0;
        }

        return 1+ Math.max(right , left);
    }
}
