// 237. Delete Node in a Linked List
// https://leetcode.com/problems/delete-node-in-a-linked-list/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-11 02:13:30
// Runtime:    0 ms (beats 100.00%)
// Memory:     45.3 MB (beats 43.53%)
// Topics:     Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
