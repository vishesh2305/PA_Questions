// 933. Number of Recent Calls
// https://leetcode.com/problems/number-of-recent-calls/
// Difficulty: Easy
// Language:   Java
// Submitted:  2026-10-06 19:51:25
// Runtime:    22 ms (beats 50.31%)
// Memory:     59.7 MB (beats 22.35%)
// Topics:     Design, Queue, Data Stream

class RecentCounter {

    

Queue<Integer> q; 
    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {

        q.add(t);

        while(q.peek() < t-3000){
            q.poll();
        }

        return q.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
