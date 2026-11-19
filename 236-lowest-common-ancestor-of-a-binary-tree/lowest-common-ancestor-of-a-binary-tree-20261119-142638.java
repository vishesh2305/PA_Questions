// 236. Lowest Common Ancestor of a Binary Tree
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-19 14:26:38
// Runtime:    17 ms (beats 62.41%)
// Memory:     70.2 MB (beats 22.45%)
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
        return findLCA(root, p,q);
    }

    private TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;

        if(root==p || root==q) return root;

        TreeNode left = findLCA(root.left,p,q);
        TreeNode right = findLCA(root.right, p, q);

        if(left != null && right != null) return root;

        if(left != null){
            return left;
        }
            return right;

    }
}
