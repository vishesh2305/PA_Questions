// 662. Maximum Width of Binary Tree
// https://leetcode.com/problems/maximum-width-of-binary-tree/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-24 02:24:16
// Runtime:    2 ms (beats 42.19%)
// Memory:     45.3 MB (beats 17.43%)
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
    public int widthOfBinaryTree(TreeNode root) {

        if(root==null) return 0;


        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

        q.offer(new Pair<>(root, 0));

        int maxwidth = q.peek().getValue();

        while(!q.isEmpty()){
            int size = q.size();

            int left = q.peek().getValue();

            int right = 0;
            
            for(int i=0; i<size; i++){
                Pair<TreeNode, Integer> pair = q.poll();
                TreeNode node = pair.getKey();
                right = pair.getValue();

                if(node.left != null){
                    q.offer(new Pair<>(node.left, right*2));
                }

                if(node.right != null){
                    q.offer(new Pair<>(node.right, (right*2) + 1));
                }
            }
            
            maxwidth = Math.max(maxwidth , right - left+1);
        }

        return maxwidth;
        
    }
}
