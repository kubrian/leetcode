class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int cycleLength = 2 * (numRows - 1);

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            int currJump = cycleLength - 2 * row;
            for (int i = row; i < s.length(); i += cycleLength) {
                sb.append(s.charAt(i));

                // Non first and last rows have 1 more char per cycle
                if (row > 0 && row < numRows - 1) {
                    int second = i + currJump;
                    if (second < s.length()) {
                        sb.append(s.charAt(second));
                    }
                }
            }
        }

        return sb.toString();
    }
}