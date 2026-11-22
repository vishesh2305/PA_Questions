// 2. Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-22 13:56:22
// Runtime:    2 ms (beats 59.50%)
// Memory:     46.1 MB (beats 53.25%)
// Topics:     Linked List, Math, Recursion

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;

        int carry = 0;

        while(l1 != null || l2 != null){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            result.next = new ListNode(sum%10);
            result = result.next;
        }

        if(carry != 0){
            result.next = new ListNode(carry);
            result = result.next;
        }

        return dummy.next;
    }
}
