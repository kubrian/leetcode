import java.util.Stack;

class Solution {
    public int calculate(String s) {
        // + and - deferred till after * and / -> use stack
        // a - b = (a + -b)
        // Add implicit + for first term
        Stack<Integer> stack = new Stack<>();
        int curr = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                curr = curr * 10 + c - '0';
            }
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                if (sign == '+') {
                    stack.push(curr);
                } else if (sign == '-') {
                    stack.push(-curr);
                } else if (sign == '*') {
                    stack.push(stack.pop() * curr);
                } else if (sign == '/') {
                    stack.push(stack.pop() / curr);
                }
                curr = 0;
                sign = c;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
