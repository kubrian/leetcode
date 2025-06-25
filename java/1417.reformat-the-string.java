import java.util.Stack;

class Solution {
    public String reformat(String s) {
        Stack<Character> digits = new Stack<>();
        Stack<Character> alphas = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.push(c);
            } else {
                alphas.push(c);
            }
        }
        if (Math.abs(digits.size() - alphas.size()) > 1) {
            return "";
        }
        if (digits.size() > alphas.size()) {
            sb.append(digits.pop());
        }
        while (sb.length() < s.length()) {
            if (!alphas.isEmpty()) {
                sb.append(alphas.pop());
            }
            if (!digits.isEmpty()) {
                sb.append(digits.pop());
            }
        }
        return sb.toString();
    }
}
