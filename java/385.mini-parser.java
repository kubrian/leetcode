import java.util.Stack;

class Solution {
    public NestedInteger deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<>();
        int i = 0;
        NestedInteger root = null;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '[') { // Start
                stack.push(new NestedInteger());
            } else if (c == ']') { // End
                NestedInteger curr = stack.pop();
                if (!stack.isEmpty()) {
                    stack.peek().add(curr);
                } else {
                    root = curr;
                }
            } else if (c != ',') { // Number
                int j = i + 1;
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    j++;
                }
                NestedInteger curr = new NestedInteger(Integer.parseInt(s.substring(i, j)));
                if (!stack.isEmpty()) {
                    stack.peek().add(curr);
                } else {
                    root = curr;
                }
                i = j - 1;
            }
            i++;
        }
        return root;
    }
}
