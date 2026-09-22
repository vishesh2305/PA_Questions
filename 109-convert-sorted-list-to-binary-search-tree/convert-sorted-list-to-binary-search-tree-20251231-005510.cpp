// 109. Convert Sorted List to Binary Search Tree
// https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
// Difficulty: Medium
// Language:   C++
// Submitted:  2025-12-31 00:55:10
// Runtime:    4 ms (beats 66.14%)
// Memory:     33 MB (beats 59.09%)
// Topics:     Linked List, Divide and Conquer, Tree, Binary Search Tree, Binary Tree

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
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
    private:
    TreeNode* build(ListNode* start, ListNode* end){
        
        if(start == end) return NULL;

        ListNode* slow = start;
        ListNode* fast = start;

        while(fast!=end && fast->next != end){
            slow = slow->next;
            fast = fast->next->next;
        }

        TreeNode* newnode = new TreeNode(slow->val);

        newnode->left = build(start, slow);
        newnode->right = build(slow->next, end);

        return newnode;

    }
public:
    TreeNode* sortedListToBST(ListNode* head) {
        if(!head) return NULL;
        return build(head,NULL);
    }
};
