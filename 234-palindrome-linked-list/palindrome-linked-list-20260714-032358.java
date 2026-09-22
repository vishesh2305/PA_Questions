// 234. Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-14 03:23:58
// Runtime:    3 ms (beats 99.82%)
// Memory:     94.5 MB (beats 43.05%)
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

        if(head == null) return true;

        ListNode slow = head;
        ListNode fast = head;


        while(fast !=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        fast = head;

        ListNode curr = slow;
        ListNode next = null;
        ListNode prev = null;

        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        };

        slow = prev;

        while(slow != null){
            if(fast.val != slow.val) return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
        
    }
}
