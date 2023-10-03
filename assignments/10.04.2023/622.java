class MyCircularQueue {
    int frnt = -1, rr = -1, k;
    int[] queue;
    public MyCircularQueue(int k) {
           this.k = k;
           queue = new int[k];
    }
    
    public boolean enQueue(int value) {
        if ((rr + 1)%k == frnt) {
            return false;
        }
        if (frnt == -1) frnt = 0;
        rr = (rr + 1)%k;
        queue[rr] = value;
        return true;
    }
    
    public boolean deQueue() {
        if (frnt == -1) return false;
        int ans = queue[frnt];
        if (frnt == rr) {
            frnt = rr = -1;
        }
        else {
            frnt = (frnt + 1)%k;
        }
        return true;
    }
    
    public int Front() {
        if (rr == -1 && frnt == -1) {
            return -1;
        }
        else {
            return queue[frnt];
        }
    }
    
    public int Rear() {
        if (rr == -1 && frnt == -1) {
            return -1;
        }
        else {
            return queue[rr];
        }
    }
    
    public boolean isEmpty() {
        if (frnt == -1 && rr == -1) return true;
        else return false;
    }
    
    public boolean isFull() {
        if ((rr+1)%k == frnt) {
            return true;
        }
        else {
            return false;
        }
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