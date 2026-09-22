// 143. Reorder List
// https://leetcode.com/problems/reorder-list/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-03 01:13:18
// Runtime:    2 ms (beats 86.42%)
// Memory:     48.9 MB (beats 96.46%)
// Topics:     Linked List, Two Pointers, Stack, Recursion

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
    public void reorderList(ListNode head) {

        if(head==null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode current = slow.next;
        slow.next = null;

        ListNode next = null;
        ListNode prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        current = prev;

        ListNode currentNext = null;
        ListNode first = head;

        ListNode firstNext = null;

        while(current != null){
            currentNext = current.next;
            firstNext = first.next;

            first.next = current;
            current.next = firstNext;

            first = firstNext;
            current = currentNext;
        }
        
    }
}
