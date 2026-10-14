// 23. Merge k Sorted Lists
// https://leetcode.com/problems/merge-k-sorted-lists/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-10-14 20:40:14
// Runtime:    6 ms (beats 26.21%)
// Memory:     46.2 MB (beats 97.88%)
// Topics:     Linked List, Divide and Conquer, Heap (Priority Queue), Merge Sort, Tournament Sort

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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(0);
        ListNode dummy = result;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<lists.length; i++){
            ListNode current = lists[i];
            while(current != null){
                pq.add(current.val);
                current = current.next;
            }
        };

        while(!pq.isEmpty()){
            dummy.next = new ListNode(pq.poll());
            dummy=dummy.next;
        };

        return result.next;

    }
}
