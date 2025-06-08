import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(new StringBuilder(), n, 0, res);
        return res;
    }

    private void helper(StringBuilder sb, int open, int close, List<String> res) {
        // Invalid
        if (open < 0 || close < 0) {
            return;
        }
        // Valid
        if (open == 0 && close == 0) {
            res.add(sb.toString());
            return;
        }
        // Recursive
        helper(sb.append("("), open - 1, close + 1, res);
        sb.deleteCharAt(sb.length() - 1);

        helper(sb.append(")"), open, close - 1, res);
        sb.deleteCharAt(sb.length() - 1);
    }
}