// 328. Odd Even Linked List
// https://leetcode.com/problems/odd-even-linked-list/
// Difficulty: Medium
// Language:   C++
// Submitted:  2026-01-05 23:19:12
// Runtime:    0 ms (beats 100.00%)
// Memory:     15.5 MB (beats 62.96%)
// Topics:     Linked List

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
    ListNode* oddEvenList(ListNode* head) {

        if(!head) return head;

        ListNode* current = head;

        ListNode* oddhead=NULL;
        ListNode* evenhead=NULL;
        ListNode* eventail=NULL;
        ListNode* oddtail=NULL;
        int position =1;
        while(current){

            ListNode* nextnode= current->next;
            current->next=NULL;

            if(position%2==0){
                if(evenhead==NULL){
                    evenhead=eventail=current;
                }else{
                    eventail->next=current;
                    eventail=current;
                }
            }else{
                if(oddhead==NULL){
                    oddhead=oddtail=current;
                }else{
                    oddtail->next=current;
                    oddtail=current;
                }
            }

            position++;
            current=nextnode;
        }

        if(evenhead==NULL) return oddhead;

        oddtail->next=evenhead;

        return oddhead;

        
    }
};
