// 1472. Design Browser History
// https://leetcode.com/problems/design-browser-history/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-06-04 18:43:27
// Runtime:    70 ms (beats 9.95%)
// Memory:     54.2 MB (beats 10.80%)
// Topics:     Array, Linked List, Stack, Design, Doubly-Linked List, Data Stream

class BrowserHistory {

    Stack<String> forward;
    Stack<String> backward;
    String current;

    public BrowserHistory(String homepage) {
        this.forward = new Stack<>();
        this.backward = new Stack<>();
        this.current = homepage;
    }
    
    public void visit(String url) {
        backward.push(current);
        current = url;
        forward.clear();
    }
    
    public String back(int steps) {
        
        while(steps > 0 && !backward.isEmpty()){
            forward.push(current);
            current = backward.pop();
            steps--;
        }
        return current;

    }
    
    public String forward(int steps) {
        while(steps> 0 && !forward.isEmpty()){
            backward.push(current);
            current = forward.pop();
            steps--;
        }
        return current;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
