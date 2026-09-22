// 144. Binary Tree Preorder Traversal
// https://leetcode.com/problems/binary-tree-preorder-traversal/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-19 19:31:55
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.3 MB (beats 33.28%)
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public static void preorder(TreeNode node, List<Integer> res){
        if(node == null) return;

        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
    }
}
