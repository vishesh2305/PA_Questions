// 19. Remove Nth Node From End of List
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-01 19:30:25
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.1 MB (beats 97.14%)
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

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i=0; i<=n; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
