import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> strings = new Stack<>();
        strings.push(new StringBuilder());

        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) { // Still counting
                count = count * 10 + c - '0';
            } else if (c == '[') { // Done counting, start tracking string
                counts.push(count);
                strings.push(new StringBuilder());
                count = 0;
            } else if (c == ']') { // Done tracking string, compose
                int k = counts.pop();
                StringBuilder sb = strings.pop();
                for (int i = 0; i < k; i++) {
                    strings.peek().append(sb);
                }
            } else {
                strings.peek().append(c);
            }
        }
        return strings.pop().toString();
    }
}
