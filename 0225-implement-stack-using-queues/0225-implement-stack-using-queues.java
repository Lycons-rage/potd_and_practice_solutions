class MyStack {

    Deque<Integer> first;

    public MyStack() {
        this.first = new ArrayDeque<>();
    }

    public void push(int x) {
        first.addLast(x);
    }

    public int pop() {
        return first.removeLast();
    }

    public int top() {
        return first.getLast();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */