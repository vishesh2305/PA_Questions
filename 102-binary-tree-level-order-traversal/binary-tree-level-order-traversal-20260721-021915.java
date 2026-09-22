// 102. Binary Tree Level Order Traversal
// https://leetcode.com/problems/binary-tree-level-order-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-21 02:19:15
// Runtime:    1 ms (beats 96.20%)
// Memory:     46.8 MB (beats 61.49%)
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

        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;


        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            int len = q.size();
            ArrayList<Integer> level = new ArrayList<>(len);

            for (int i = 0; i < len; i++) {
                TreeNode curr = q.poll();

                level.add(curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            res.add(level);
        }

        return res;

    }
}
