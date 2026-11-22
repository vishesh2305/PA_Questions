// 19. Remove Nth Node From End of List
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-22 13:40:45
// Runtime:    0 ms (beats 100.00%)
// Memory:     42.9 MB (beats 85.97%)
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

        if(head==null || n<=0) return head;

        ListNode dummy = new ListNode(0, head);

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i=0; i<=n; i++){
            if(fast==null) return head;

            fast = fast.next;
        }

        while(fast!=null){
            fast = fast.next;
            slow=slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
        
    }
}
