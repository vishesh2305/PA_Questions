// 199. Binary Tree Right Side View
// https://leetcode.com/problems/binary-tree-right-side-view/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-22 03:05:00
// Runtime:    1 ms (beats 71.77%)
// Memory:     43.8 MB (beats 15.24%)
// Topics:     Tree, Depth-First Search, Breadth-First Search, Binary Tree

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
    public List<Integer> rightSideView(TreeNode root) {

        if(root==null) return new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> q =new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){

            int size = q.size();

            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                if(i==size-1) res.add(curr.val);
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }

            }

        }
        return res;
        
    }
}
