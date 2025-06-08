import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            switch (x) {
                case '(':
                case '[':
                case '{':
                    stack.push(x);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}