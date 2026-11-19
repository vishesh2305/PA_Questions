// 236. Lowest Common Ancestor of a Binary Tree
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-19 14:28:19
// Runtime:    18 ms (beats 54.46%)
// Memory:     70 MB (beats 53.35%)
// Topics:     Tree, Depth-First Search, Binary Tree, Binary Lifting, Lowest Common Ancestor

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;

        if(root== p || root== q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) return root;

        if(left != null) return left;

        return right;
    }
}
