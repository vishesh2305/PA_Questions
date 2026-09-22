// 104. Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-23 03:20:36
// Runtime:    0 ms (beats 100.00%)
// Memory:     46.7 MB (beats 91.81%)
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
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);


        return 1+Math.max(l, r);
        
    }
}
