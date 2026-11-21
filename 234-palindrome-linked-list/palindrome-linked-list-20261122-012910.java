// 234. Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-22 01:29:10
// Runtime:    3 ms (beats 99.85%)
// Memory:     93.8 MB (beats 81.48%)
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
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;

        ListNode curr = slow;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        slow = prev;

        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;

    }
}
