// 1008. Construct Binary Search Tree from Preorder Traversal
// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-22 01:28:48
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.7 MB (beats 22.63%)
// Topics:     Array, Stack, Tree, Binary Search Tree, Monotonic Stack, Binary Tree

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

    int index =0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE);
    }

    public TreeNode helper(int[] preorder, int upperbound){

        if(index == preorder.length) return null;
        if(preorder[index] > upperbound) return null;

        TreeNode root = new TreeNode(preorder[index++]);

        root.left = helper(preorder, root.val);

        root.right = helper(preorder, upperbound);

        return root;
    }
}
