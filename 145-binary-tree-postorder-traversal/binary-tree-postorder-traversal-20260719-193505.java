// 145. Binary Tree Postorder Traversal
// https://leetcode.com/problems/binary-tree-postorder-traversal/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-19 19:35:05
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.9 MB (beats 93.46%)
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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;        
    }
    public static void postorder(TreeNode node, List<Integer> res){
        if(node == null) return;

        postorder(node.left, res);
        postorder(node.right, res);
        res.add(node.val);
    }
}
