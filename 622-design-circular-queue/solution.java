// 622. Design Circular Queue
// https://leetcode.com/problems/design-circular-queue/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-11 14:13:16
// Runtime:    4 ms (beats 100.00%)
// Memory:     46.3 MB (beats 55.45%)
// Topics:     Array, Linked List, Design, Queue

class MyCircularQueue {

    public static int front;
    public static int rear;
    public static int SIZE;

    public static int[] array;

    public MyCircularQueue(int k) {
        this.SIZE = k;
        this.array = new int[SIZE];
        this.front = -1;
        this.rear = -1;
    }
    
    public boolean enQueue(int value) {
        if((rear + 1) % SIZE == front) return false;

        if(front == -1){
            front = 0;
        };

        rear = (rear + 1) % SIZE;
        array[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(front == -1){
            return false;
        }
        int item = array[front];

        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1) % SIZE;
        }

        return true;

    }
    
    public int Front() {
        if(front == -1) return -1;

        return array[front];
    }
    
    public int Rear() {
        if(rear == -1) return -1;
        return array[rear];
    }
    
    public boolean isEmpty() {
        if(front == -1) return true;
        return false;
    }
    
    public boolean isFull() {
        if((rear + 1) % SIZE == front) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
