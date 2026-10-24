// 103. Binary Tree Zigzag Level Order Traversal
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-10-24 12:19:35
// Runtime:    1 ms (beats 84.42%)
// Memory:     43.3 MB (beats 92.37%)
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root==null) return result;

        int level = 1;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> sublist = new ArrayList<>();

            for(int i=0; i<len; i++){
                TreeNode curr = q.poll();

                if(level % 2 == 0){
                    sublist.add(0,curr.val);
                }else{
                    sublist.add(curr.val);
                }
                
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            result.add(sublist);
            level++;
        }

        return result;
        
    }
}
