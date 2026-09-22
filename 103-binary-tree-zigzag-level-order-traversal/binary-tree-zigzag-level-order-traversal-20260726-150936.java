// 103. Binary Tree Zigzag Level Order Traversal
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-26 15:09:36
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.7 MB (beats 44.23%)
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

        if(root==null) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        boolean LeftToRight = true;

        while(!q.isEmpty()){
            int l = q.size();

            LinkedList<Integer> list = new LinkedList<>();

            for(int i=0; i<l; i++){
                TreeNode curr = q.poll();

                if(LeftToRight){
                    list.addLast(curr.val);
                }else{
                    list.addFirst(curr.val);
                }
                
                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }

            }

            result.add(list);
            LeftToRight = !LeftToRight;

        }

        return result;
        
    }
}
