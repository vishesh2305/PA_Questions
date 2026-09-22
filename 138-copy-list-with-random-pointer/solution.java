// 138. Copy List with Random Pointer
// https://leetcode.com/problems/copy-list-with-random-pointer/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-09 01:26:24
// Runtime:    0 ms (beats 100.00%)
// Memory:     46.7 MB (beats 14.48%)
// Topics:     Hash Table, Linked List

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null) return head;

        Node temp = head;

        while(temp != null){
            Node newnode = new Node(temp.val);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = temp.next.next;
        }
        temp = head;

        while(temp != null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }else{
                temp.next.random = null;
            }
            temp = temp.next.next;
        }

        temp = head;

        Node dummy = new Node(0);

        Node res = dummy;

        while(temp != null){
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp = temp.next;
        }

        return dummy.next;

        
    }
}
