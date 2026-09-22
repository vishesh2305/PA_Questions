// 86. Partition List
// https://leetcode.com/problems/partition-list/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-09 00:25:13
// Runtime:    0 ms (beats 100.00%)
// Memory:     43.8 MB (beats 49.44%)
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
    public ListNode partition(ListNode head, int x) {

        ListNode dummy_small = new ListNode(0);
        ListNode dummy_greater = new ListNode(0);

        ListNode small = dummy_small;
        ListNode greater = dummy_greater;

        ListNode temp = head;

        while(temp != null){
            if(temp.val >= x){
                greater.next = new ListNode(temp.val);
                greater = greater.next;
            }else{
                small.next = new ListNode(temp.val);
                small = small.next;
            }
            temp = temp.next;
        }

        small.next = dummy_greater.next;

        return dummy_small.next;
        
    }
}
