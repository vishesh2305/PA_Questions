// 234. Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-22 01:32:03
// Runtime:    4 ms (beats 71.30%)
// Memory:     93.9 MB (beats 74.63%)
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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;

        ListNode curr = slow;
        ListNode next = null;
        ListNode prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        slow = prev;

        while(slow != null){
            if(slow.val != fast.val) return false;

            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
}
