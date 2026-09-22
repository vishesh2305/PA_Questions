// 203. Remove Linked List Elements
// https://leetcode.com/problems/remove-linked-list-elements/
// Difficulty: Easy
// Language:   C++
// Submitted:  2026-01-04 23:29:27
// Runtime:    0 ms (beats 100.00%)
// Memory:     20.1 MB (beats 42.88%)
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
    ListNode* removeElements(ListNode* head, int val) {

        if(head==NULL) return NULL;

        while(head && head->val == val){
            head=head->next;
        }

        ListNode* current = head;

        while(current && current->next){

            ListNode* temp = current->next;

            if(temp->val == val){
                current->next = temp->next;
            }else{
                current=current->next;
            }

        }
        return head;
    }
};
