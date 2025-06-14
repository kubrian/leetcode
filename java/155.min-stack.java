import java.util.Stack;

class Pair {
    int val;
    int min;

    public Pair(int val, int min) {
        this.val = val;
        this.min = min;
    }
}


class MinStack {

    private Stack<Pair> stack = new Stack<>();

    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.empty()) {
            stack.push(new Pair(val, val));
        } else {
            stack.push(new Pair(val, Math.min(val, stack.peek().min)));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }
}
