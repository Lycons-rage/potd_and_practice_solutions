class MinStack {

    Deque<Integer> first;

    public MinStack() {
        this.first = new ArrayDeque<>();
    }

    public void push(int val) {
        first.addLast(val);
    }

    public void pop() {
        first.removeLast();
    }

    public int top() {
        return first.getLast();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        int n = 0;
        while (n<first.size()){
            int current_val = first.removeLast();
            if (current_val < min){
                min = current_val;
            }
            first.addFirst(current_val);
            n++;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */