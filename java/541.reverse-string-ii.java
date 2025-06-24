import java.util.Stack;

class Solution {
    public String reverseStr(String s, int k) {
        Stack<Character> rev = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % (2 * k) < k) {
                rev.push(s.charAt(i));
            } else {
                while (!rev.isEmpty()) {
                    sb.append(rev.pop());
                }
                sb.append(s.charAt(i));
            }
        }
        while (!rev.isEmpty()) {
            sb.append(rev.pop());
        }
        return sb.toString();
    }
}
