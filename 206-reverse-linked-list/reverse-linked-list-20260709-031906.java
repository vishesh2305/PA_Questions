// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-09 03:19:06
// Runtime:    0 ms (beats 100.00%)
// Memory:     44.2 MB (beats 49.73%)
// Topics:     Linked List, Recursion

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
    public ListNode reverseList(ListNode head) {

        if(head==null) return null;

        ListNode curr = head;
        ListNode next;
        ListNode prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head= prev;
        return head;
        
    }
}
