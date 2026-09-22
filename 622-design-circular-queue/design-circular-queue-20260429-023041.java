// 622. Design Circular Queue
// https://leetcode.com/problems/design-circular-queue/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-04-29 02:30:41
// Runtime:    4 ms (beats 100.00%)
// Memory:     46.6 MB (beats 51.87%)
// Topics:     Array, Linked List, Design, Queue

class MyCircularQueue {

    int[] queue;
    int size;
    int front;
    int rear;

    public MyCircularQueue(int k) {
        this.queue = new int[k];
        this.size = k;
        this.front = -1;
        this.rear = -1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1)%size;
        queue[rear] = value;
        return true;
    }
    
    public boolean deQueue() {

        if(isEmpty()) return false;

        if(front==rear){
            front = rear = -1;
        }else{
            front = (front+1)%size;
        }
        return true;
        
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return (rear+1)%size == front;
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
