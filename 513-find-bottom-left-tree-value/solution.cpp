// 513. Find Bottom Left Tree Value
// https://leetcode.com/problems/find-bottom-left-tree-value/
// Difficulty: Medium
// Language:   C++
// Submitted:  2026-01-01 01:37:14
// Runtime:    0 ms (beats 100.00%)
// Memory:     25 MB (beats 46.63%)
// Topics:     Tree, Depth-First Search, Breadth-First Search, Binary Tree

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int findBottomLeftValue(TreeNode* root) {
        
        queue<TreeNode*> q;
        q.push(root);
        int LeftmostNode;

        while(!q.empty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode* curr = q.front();
                if(i==0){
                    LeftmostNode = curr->val;
                }
                q.pop();
                if(curr->left) q.push(curr->left);
                if(curr->right) q.push(curr->right);
            }

        }
        return LeftmostNode;

    }
};
