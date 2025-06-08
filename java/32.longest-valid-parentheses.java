import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        int longest = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // Push the index of opening bracket
                stack.push(i);
            } else {
                // Get the location of the current matching bracket -- if there is none, it will
                // be empty next.
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i); // New matching pos.
                }
                // Peek is current prev unmatched.
                longest = Math.max(longest, i - stack.peek());
            }
        }
        return longest;
    }
}
