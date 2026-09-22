// 700. Search in a Binary Search Tree
// https://leetcode.com/problems/search-in-a-binary-search-tree/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-21 02:46:50
// Runtime:    0 ms (beats 100.00%)
// Memory:     47.1 MB (beats 16.58%)
// Topics:     Tree, Binary Search Tree, Binary Tree

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
    public TreeNode searchBST(TreeNode root, int val) {

        while(root != null && root.val != val){
            if(root.val > val){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return root;
        
    }
}
