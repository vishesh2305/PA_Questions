// 61. Rotate List
// https://leetcode.com/problems/rotate-list/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-01 20:19:55
// Runtime:    0 ms (beats 100.00%)
// Memory:     44.4 MB (beats 44.20%)
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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next == null) return head;

        int n = 1;

        ListNode temp = head;

        while(temp.next != null){
            n++;
            temp = temp.next;
            if(temp.next == null){
                temp.next = head;
                break;
            }
        }

        k = k % n;

        temp = head;

        for(int i=0; i<n-k-1; i++){
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;
        return head;
        
    }
}
