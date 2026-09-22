// 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-12 13:46:45
// Runtime:    0 ms (beats 100.00%)
// Memory:     47.1 MB (beats 16.66%)
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
