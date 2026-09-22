// 226. Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/
// Difficulty: Easy
// Language:   C++
// Submitted:  2025-12-22 13:03:33
// Runtime:    0 ms (beats 100.00%)
// Memory:     12.5 MB (beats 25.88%)
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
    TreeNode* invertTree(TreeNode* root) {


    if(root){
        invertTree(root->left);
        invertTree(root->right);
        swap(root->left, root->right);
    };

    return root;
        
    }
};
