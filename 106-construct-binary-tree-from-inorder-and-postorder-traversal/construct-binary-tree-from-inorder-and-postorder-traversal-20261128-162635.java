// 106. Construct Binary Tree from Inorder and Postorder Traversal
// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-28 16:26:35
// Runtime:    3 ms (beats 32.56%)
// Memory:     45 MB (beats 94.60%)
// Topics:     Array, Hash Table, Divide and Conquer, Tree, Binary Tree

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
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int N = postorder.length;
        postIndex = N-1;

        return construct(inorder, postorder, 0, postIndex);

    }

    public TreeNode construct(int[] inorder, int[] postorder, int start, int end){
        if(start > end) return null;

        int val = postorder[postIndex--];

        TreeNode root = new TreeNode(val);

        int index = start;

        while(inorder[index] != val){
            index++;
        }

        root.right = construct(inorder, postorder, index+1, end);
        root.left = construct(inorder, postorder, start, index-1);

        return root;
    }
}
