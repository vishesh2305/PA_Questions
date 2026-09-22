// 112. Path Sum
// https://leetcode.com/problems/path-sum/
// Difficulty: Easy
// Language:   C++
// Submitted:  2025-12-21 19:27:32
// Runtime:    0 ms (beats 100.00%)
// Memory:     21.4 MB (beats 95.51%)
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
    bool hasPathSum(TreeNode* root, int targetSum) {

        if(root==NULL) return false;

        if(!root->left && !root->right && targetSum==root->val) return true;

        return hasPathSum(root->left, targetSum-root->val) || hasPathSum(root->right, targetSum-root->val);
        
    }
};
