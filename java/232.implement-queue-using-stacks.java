import java.util.Stack;

class MyQueue {

    Stack<Integer> ready = new Stack<>();
    Stack<Integer> hold = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
        hold.push(x);
    }

    public int pop() {
        transfer();
        return ready.pop();
    }

    public int peek() {
        transfer();
        return ready.peek();
    }

    public boolean empty() {
        return ready.empty() && hold.empty();
    }

    private void transfer() {
        if (ready.empty()) {
            while (!hold.empty()) {
                ready.push(hold.pop());
            }
        }
    }
}
