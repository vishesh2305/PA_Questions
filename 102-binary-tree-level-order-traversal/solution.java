// 102. Binary Tree Level Order Traversal
// https://leetcode.com/problems/binary-tree-level-order-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-10-24 11:36:31
// Runtime:    1 ms (beats 96.91%)
// Memory:     46.5 MB (beats 81.59%)
// Topics:     Tree, Breadth-First Search, Binary Tree

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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> sublist = new ArrayList<>();

            for(int i=0; i<len; i++){
                TreeNode curr = q.poll();
                sublist.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            result.add(sublist);
        }

        return result;
        
    }
}
