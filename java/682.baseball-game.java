import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        // Definitely a stack
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a);
                stack.push(b);
                stack.push(a + b);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
