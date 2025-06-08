class Solution {
    public int myAtoi(String s) {
        // Ignore whitespace
        int pos = 0;
        while (pos < s.length() && s.charAt(pos) == ' ') {
            pos++;
        }
        if (pos == s.length())
            return 0; // Check end

        // Check sign
        int sign = 1;
        switch (s.charAt(pos)) {
            case '-':
                sign = -1;
                pos++;
                break;
            case '+':
                pos++;
                break;
        }

        if (pos == s.length())
            return 0; // Check end

        int res = 0;
        loop: while (pos < s.length()) {
            char currChar = s.charAt(pos);
            int currNum;
            switch (currChar) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    currNum = currChar - '0';
                    pos++;
                    break;
                default:
                    break loop;
            }
            int newNum = res * 10 + currNum * sign;
            if (res < 0 && (res < Integer.MIN_VALUE / 10 || newNum > res)) {
                return Integer.MIN_VALUE;
            } else if (res > 0 && (res > Integer.MAX_VALUE / 10 || newNum < res)) {
                return Integer.MAX_VALUE;
            }
            res = newNum;
        }
        return res;
    }
}