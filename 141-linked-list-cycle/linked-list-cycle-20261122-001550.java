// 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-11-22 00:15:50
// Runtime:    0 ms (beats 100.00%)
// Memory:     46.3 MB (beats 76.46%)
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
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;


    }
}
