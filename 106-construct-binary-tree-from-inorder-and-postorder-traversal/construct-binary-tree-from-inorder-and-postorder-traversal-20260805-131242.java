// 106. Construct Binary Tree from Inorder and Postorder Traversal
// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-08-05 13:12:42
// Runtime:    1 ms (beats 99.16%)
// Memory:     46.4 MB (beats 49.36%)
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<inorder.length ; i++){
            map.put(inorder[i], i);
        }

        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
        
    }

    public TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd, HashMap<Integer, Integer> map){

        if(inStart > inEnd || postStart > postEnd) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);

        int inRoot = map.get(root.val);

        int LeftNums = inRoot - inStart;

        root.left = build(inorder, inStart, inRoot-1, postorder, postStart, postStart+LeftNums-1, map);

        root.right = build(inorder, inRoot+1, inEnd, postorder, postStart+LeftNums, postEnd -1, map);

        return root;


    }
}
