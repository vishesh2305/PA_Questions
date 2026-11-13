// 106. Construct Binary Tree from Inorder and Postorder Traversal
// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-13 11:43:04
// Runtime:    3 ms (beats 30.74%)
// Memory:     45 MB (beats 96.09%)
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
    static int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int N = postorder.length;

        postIndex = N-1;

        return construct(inorder, postorder, 0, N-1);
    }

    private static TreeNode construct(int[] inorder, int[] postorder, int start, int end){
        if(start > end) return null;

        int value = postorder[postIndex--];

        TreeNode root = new TreeNode(value);

        int index = start;
        while(inorder[index] != value){
            index++;
        }

        root.right = construct(inorder, postorder, index+1, end);
        root.left = construct(inorder, postorder, start, index-1);

        return root;
    }
}
