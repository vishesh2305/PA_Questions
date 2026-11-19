// 222. Count Complete Tree Nodes
// https://leetcode.com/problems/count-complete-tree-nodes/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-19 14:35:54
// Runtime:    0 ms (beats 100.00%)
// Memory:     49.2 MB (beats 47.61%)
// Topics:     Binary Search, Bit Manipulation, Tree, Binary Tree

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
    private int lh(TreeNode root){
        if(root==null) return 0;

        int height =0;

        while(root != null){
            height++;
            root = root.left;
        }

        return height;
    }
    private int rh(TreeNode root){
        if(root==null) return 0;

        int height =0;

        while(root != null){
            height++;
            root = root.right;
        }

        return height;
    }


    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int leftheight = lh(root);
        int rightheight = rh(root);

        if(leftheight == rightheight){
            return (int) Math.pow(2, leftheight)-1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
