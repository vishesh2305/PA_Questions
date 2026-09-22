// 98. Validate Binary Search Tree
// https://leetcode.com/problems/validate-binary-search-tree/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-21 03:08:29
// Runtime:    0 ms (beats 100.00%)
// Memory:     45.1 MB (beats 50.89%)
// Topics:     Tree, Depth-First Search, Binary Search Tree, Binary Tree

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
    public boolean isValidBST(TreeNode root) {

        if(root == null) return true;
        
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean check(TreeNode root, long min , long max){
        if(root==null) return true;

        if(root.val <= min || root.val >= max) return false;

        return check(root.left, min, root.val) && check(root.right, root.val, max);

    }
}
