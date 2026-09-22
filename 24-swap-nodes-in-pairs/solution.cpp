// 24. Swap Nodes in Pairs
// https://leetcode.com/problems/swap-nodes-in-pairs/
// Difficulty: Medium
// Language:   C++
// Submitted:  2025-12-14 16:35:44
// Runtime:    0 ms (beats 100.00%)
// Memory:     11.2 MB (beats 19.97%)
// Topics:     Linked List, Recursion

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
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {

        if(head==NULL || head->next == NULL) return head;

        ListNode* result = new ListNode();
        ListNode* temp = result;

        ListNode* current = head;
        while(current != NULL && current->next != NULL){

            temp->next = current->next;
            current->next = temp->next->next;
            temp->next->next= current;

            temp = current;
            current = current->next;

        }

        return result->next;
        
    }
};
