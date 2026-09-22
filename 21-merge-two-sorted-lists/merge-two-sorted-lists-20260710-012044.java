// 21. Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-07-10 01:20:44
// Runtime:    0 ms (beats 100.00%)
// Memory:     44.3 MB (beats 38.52%)
// Topics:     Linked List, Recursion

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2==null) return list1;

        ListNode temp1= list1;
        ListNode temp2 = list2;

        ListNode dummy = new ListNode(0);

        ListNode result = dummy;

        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                dummy.next = temp1;
                temp1=temp1.next;
            }else{
                dummy.next = temp2;
                temp2=temp2.next;
            }
            dummy=dummy.next;
        }

        while(temp1 != null){
            dummy.next = temp1;
            temp1=temp1.next;
            dummy=dummy.next;
        }

        while(temp2 != null){
            dummy.next = temp2;
            temp2 = temp2.next;
            dummy=dummy.next;
        }

        return result.next;
        
    }
}
