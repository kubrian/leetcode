import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> stack = new LinkedList<>();

    public MyStack() {}

    public void push(int x) {
        stack.offer(x);
        for (int i = 0; i < stack.size() - 1; i++) {
            stack.offer(stack.poll());
        }
    }

    public int pop() {
        return stack.poll();
    }

    public int top() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
