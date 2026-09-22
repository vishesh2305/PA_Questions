// 706. Design HashMap
// https://leetcode.com/problems/design-hashmap/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-04-30 04:19:10
// Runtime:    15 ms (beats 93.61%)
// Memory:     47.9 MB (beats 96.50%)
// Topics:     Array, Hash Table, Linked List, Design, Hash Function

class MyHashMap {

    class Node{
        int key;
        int value;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    private Node[] buckets;
    private int size;
    private static final double load_factor = 0.75;
    private static final int Default_Capacity = 4;

    public MyHashMap() {
        buckets = new Node[Default_Capacity];
        size =0; 
    }

    private int getIndex(int key, int capacity){
        return key % capacity;
    }
    
    public void put(int key, int value) {
        int index = getIndex(key, buckets.length);
        Node head = buckets[index];

        Node curr = head;

        while(curr != null){
            if(curr.key == key){
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
        size++;

        if((double)size/buckets.length >= load_factor){
            resize();
        }

    }

    private void resize(){
        int newCapacity = buckets.length*2;
        Node[] new_buckets = new Node [newCapacity];

        for(int i=0; i<buckets.length; i++){
            Node curr = buckets[i];

            while(curr != null){
                Node nextTemp = curr.next;

                int newIndex = getIndex(curr.key, newCapacity);

                curr.next = new_buckets[newIndex];
                new_buckets[newIndex] = curr;

                curr = nextTemp;
            }
        }
        buckets=new_buckets;
    }


    
    public int get(int key) {

        int index = getIndex(key, buckets.length);
        Node curr = buckets[index];

        while(curr != null){
            if(curr.key == key){
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;        
    }
    
    public void remove(int key) {
        int index = getIndex(key, buckets.length);
        Node curr = buckets[index];

        if(curr == null) return;

        if(curr.key == key){
            buckets[index] = curr.next;
            size--;
            return;
        }

        while(curr.next != null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                size--;
                return;
            }
            curr = curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
