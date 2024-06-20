class MyQueue {

    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }

    public void push(int x) {
        while(!second.empty()){
            int temp = second.pop();
            first.push(temp);
        }
        first.push(x);
    }

    public int pop() {
        while (!first.empty()){
            int temp_val = first.pop();
            second.push(temp_val);
        }
        return second.pop();
    }

    public int peek() {
        while (!first.empty()){
            int temp_val = first.pop();
            second.push(temp_val);
        }
        return second.peek();
    }

    public boolean empty() {
        while (!first.empty()){
            int temp_val = first.pop();
            second.push(temp_val);
        }
        return second.empty();
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