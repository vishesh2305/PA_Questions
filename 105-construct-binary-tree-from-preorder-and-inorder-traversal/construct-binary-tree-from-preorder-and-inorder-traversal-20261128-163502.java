// 105. Construct Binary Tree from Preorder and Inorder Traversal
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-28 16:35:02
// Runtime:    4 ms (beats 14.41%)
// Memory:     45.1 MB (beats 91.12%)
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
    int preIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int N = preorder.length;

        preIndex = 0;

        return construct(preorder, inorder, 0, N-1);

    }

    public TreeNode construct(int[] preorder, int[] inorder, int start, int end){
        if(start > end) return null;

        
        int val = preorder[preIndex];

        if(preIndex < preorder.length){
            preIndex++;
        }

        TreeNode root = new TreeNode(val);

        int index = 0;

        while(inorder[index] != val){
            index++;
        }

        root.left = construct(preorder, inorder, start, index-1);
        root.right = construct(preorder, inorder, index+1, end);

        return root;
    }
}
