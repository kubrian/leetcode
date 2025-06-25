class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // exclude 0 -> 1
                if (depth++ != 0) {
                    sb.append(c);
                }
            } else {
                // exclude 1 -> 0
                if (--depth != 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
