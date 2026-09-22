// 101. Symmetric Tree
// https://leetcode.com/problems/symmetric-tree/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-28 00:20:14
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.9 MB (beats 15.89%)
// Topics:     Tree, Depth-First Search, Breadth-First Search, Binary Tree

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
    public boolean isSymmetric(TreeNode root) {

        if(root==null) return true;

        return helper(root.left, root.right);
        
    }

    public boolean helper(TreeNode left, TreeNode right){
        if(left == null || right == null) return left==right;
        if(left.val != right.val) return false;

        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}
