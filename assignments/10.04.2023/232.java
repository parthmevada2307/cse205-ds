class MyQueue {
    Stack<Integer> Q;

    public MyQueue() {
        Q = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (Q.isEmpty()) {
            Q.push(x);
            return;
        }
        int Pop = Q.pop();
        push(x);
        Q.push(Pop);
    }
    
    public int pop() {
        return Q.pop();
    }
    
    public int peek() {
        return Q.peek();
    }
    
    public boolean empty() {
        return Q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */