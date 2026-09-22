// 124. Binary Tree Maximum Path Sum
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-08-04 10:15:05
// Runtime:    0 ms (beats 100.00%)
// Memory:     46.6 MB (beats 56.56%)
// Topics:     Dynamic Programming, Tree, Depth-First Search, Binary Tree, DP on Trees

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
    int maxsum =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        if(root==null) return 0;
        MaxPath(root);
        return maxsum;
        
    }
    private int MaxPath(TreeNode root){
        if(root==null) return 0;
        int left =Math.max(0, MaxPath(root.left));
        int right =Math.max(0,MaxPath(root.right));
        maxsum = Math.max(maxsum, left + right + root.val);

        return root.val + Math.max(left, right);
    }
}
