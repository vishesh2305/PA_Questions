// 144. Binary Tree Preorder Traversal
// https://leetcode.com/problems/binary-tree-preorder-traversal/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-10-26 12:40:26
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.6 MB (beats 95.36%)
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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();

        List<Integer> result = new ArrayList<>();
        if(root==null) return result;

        st.add(root);

        while(!st.isEmpty()){

            TreeNode curr = st.pop();

            result.add(curr.val);

            if(curr.right != null){
                st.add(curr.right);
            }
            if(curr.left != null){
                st.add(curr.left);
            }
        }

        return result;
    }
}
