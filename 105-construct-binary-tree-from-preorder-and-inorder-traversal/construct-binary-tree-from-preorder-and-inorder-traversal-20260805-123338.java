// 105. Construct Binary Tree from Preorder and Inorder Traversal
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-08-05 12:33:38
// Runtime:    1 ms (beats 97.60%)
// Memory:     46.2 MB (beats 68.78%)
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return build(preorder, 0, preorder.length -1, inorder, 0, inorder.length-1, map);
    }

    public TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> map){
        if(preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int inIndex = map.get(root.val);

        int numsLeft = inIndex - inStart;

        root.left = build(preorder, preStart+1, preStart+numsLeft, inorder, inStart, inIndex-1, map);

        root.right = build(preorder, preStart+numsLeft+1, preEnd, inorder, inIndex+1, inEnd, map);

        return root;

    }
}
