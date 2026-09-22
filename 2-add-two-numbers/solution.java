// 2. Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-07-11 01:32:11
// Runtime:    1 ms (beats 100.00%)
// Memory:     46.5 MB (beats 38.20%)
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

        int carry =0;

        ListNode result = new ListNode(0);

        ListNode dummy = result;

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

            carry = sum/10;

            dummy.next = new ListNode(sum%10);
            dummy=dummy.next;
        }

        if(carry != 0){
            dummy.next = new ListNode(carry);
            dummy=dummy.next;
        }

        return result.next;
        
    }
}
