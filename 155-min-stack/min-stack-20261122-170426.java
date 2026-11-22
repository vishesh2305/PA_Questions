// 155. Min Stack
// https://leetcode.com/problems/min-stack/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-22 17:04:26
// Runtime:    33 ms (beats 69.39%)
// Memory:     101.9 MB (beats 30.11%)
// Topics:     Stack, Design

class MinStack {

    private Stack<Long> st;

    private long minVal;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        long val = value;
        if(st.isEmpty()){
            st.push(val);
            minVal = val;
        }else if(val >= minVal){
            st.push(val);
        }else{
            st.push((2L * val) - minVal);
            minVal = val;
        }
    }
    
    public void pop() {

        if(st.isEmpty()) return;

        long popped = st.pop();

        if(popped < minVal){
            minVal = 2L * minVal - popped;
        }
        
    }
    
    public int top() {
        long first = st.peek();
        if(first < minVal){
            return (int)minVal;
        }

        return (int)first;
    }
    
    public int getMin() {
        return (int)minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
