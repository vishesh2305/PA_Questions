// 1381. Design a Stack With Increment Operation
// https://leetcode.com/problems/design-a-stack-with-increment-operation/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-10-12 13:26:34
// Runtime:    6 ms (beats 36.38%)
// Memory:     47 MB (beats 61.54%)
// Topics:     Array, Stack, Design

class CustomStack {

    private int[] data;
    private int top;

    public CustomStack(int maxSize) {
        data = new int[maxSize];
        top = -1;
    }
    
    public void push(int x) {
        if(top != data.length-1){
            data[++top] = x;
        }
        return;
    }
    
    public int pop() {
        if(top != -1){
            return data[top--];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int n = top+1;
        k = Math.min(k, n);
        for(int i=0; i<n; i++){
            if(i<k){
                data[i] += val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
