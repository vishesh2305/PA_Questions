// 92. Reverse Linked List II
// https://leetcode.com/problems/reverse-linked-list-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-09 00:41:02
// Runtime:    0 ms (beats 100.00%)
// Memory:     43 MB (beats 66.83%)
// Topics:     Linked List

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left == right) return head;

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode beforestart = dummy;

        for(int i= 1; i<left; i++){
            beforestart = beforestart.next;
        }

        ListNode start = beforestart.next;

        ListNode current = start;

        ListNode prev = null;
        ListNode next = null;

        for(int i=0; i<=right-left; i++){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        };

        beforestart.next = prev;

        start.next = current;




        return dummy.next;

    }
}
