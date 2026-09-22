// 142. Linked List Cycle II
// https://leetcode.com/problems/linked-list-cycle-ii/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-03 01:05:13
// Runtime:    0 ms (beats 100.00%)
// Memory:     46.5 MB (beats 86.05%)
// Topics:     Hash Table, Linked List, Two Pointers, Floyd's Cycle Finding Algorithm

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head==null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
        
    }
}
