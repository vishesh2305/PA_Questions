// 25. Reverse Nodes in k-Group
// https://leetcode.com/problems/reverse-nodes-in-k-group/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-07-14 03:01:14
// Runtime:    0 ms (beats 100.00%)
// Memory:     46.5 MB (beats 34.92%)
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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || k < 1) return head;
        
        ListNode temp = head;

        int nodes =0;

        while(temp != null){
            temp=temp.next;
            nodes++;
        }

        int groups = nodes/k;

        temp = head;

        ListNode prevgrouptail = null;

        while(groups-->0){
            
            ListNode grouphead = temp;
            ListNode nextgrouphead = temp;

            for(int i=0; i<k; i++){
                nextgrouphead = nextgrouphead.next;
            }

            ListNode newhead = reverseLL(grouphead, k);

            if(prevgrouptail == null){
                head = newhead;
            }else{
                prevgrouptail.next = newhead;
            }

            prevgrouptail = grouphead;
            grouphead.next = nextgrouphead;

            temp = nextgrouphead;
        }

        return head;

    }

    public static ListNode reverseLL(ListNode head, int count){
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(count-->0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
