// 94. Binary Tree Inorder Traversal
// https://leetcode.com/problems/binary-tree-inorder-traversal/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-19 19:26:24
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.9 MB (beats 92.72%)
// Topics:     Stack, Tree, Depth-First Search, Binary Tree

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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        inorder(root , res);

        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res){
        if(root==null) return;

        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}
