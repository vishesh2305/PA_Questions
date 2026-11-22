// 19. Remove Nth Node From End of List
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-22 12:40:06
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.7 MB (beats 96.40%)
// Topics:     Linked List, Two Pointers

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null) return head;

        ListNode temp = head;
        int nodes = 1;

        while(temp.next != null){
            nodes++;
            temp = temp.next;
        }

        if(nodes == 1 && n == 1) return null;

        if(nodes < n) return head;

        int nth = nodes - n;

        if(nth == 0){
            head = head.next;
            return head;
        }

        temp = head;

        for(int i=0; i<nth-1; i++){
            temp = temp.next;
        }

        if(temp.next != null && temp.next.next != null){
            ListNode nextnode = temp.next.next;
            temp.next = nextnode;
        }else{
            temp.next = null;
        }

        return head;
        
    }
}
