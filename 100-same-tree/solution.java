// 100. Same Tree
// https://leetcode.com/problems/same-tree/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-28 19:55:27
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.1 MB (beats 94.49%)
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q ==null) return true;

        if(p==null && q != null) return false;

        if(p != null && q == null) return false;

        if(p.val != q.val ) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
