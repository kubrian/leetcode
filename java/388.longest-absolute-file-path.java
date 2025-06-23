import java.util.Stack;

class Solution {
    public int lengthLongestPath(String input) {
        String[] paths = input.split("\n");
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (String path : paths) {
            // Count number of \t (0-based)
            int level = path.lastIndexOf("\t") + 1;
            while (stack.size() > level) {
                stack.pop();
            }
            int len = path.length() - level;
            int prev = stack.isEmpty() ? -1 : stack.peek();
            stack.push(prev + 1 + len);
            if (path.contains(".")) {
                res = Math.max(res, stack.peek());
            }
        }
        return res;        
    }
}
