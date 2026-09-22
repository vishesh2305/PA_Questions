// 543. Diameter of Binary Tree
// https://leetcode.com/problems/diameter-of-binary-tree/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-24 02:54:00
// Runtime:    0 ms (beats 100.00%)
// Memory:     47.1 MB (beats 28.05%)
// Topics:     Tree, Depth-First Search, Binary Tree, DP on Trees

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
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        height(root);

        return diameter;
        
    }
    public int height(TreeNode root){
        if(root==null) return 0;

        int lefth = height(root.left);
        int righth = height(root.right);

        diameter = Math.max(diameter, lefth+righth);

        return Math.max(lefth, righth)+1;
    }
}
