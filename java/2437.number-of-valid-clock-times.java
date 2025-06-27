class Solution {
    public int countTime(String time) {
        // settle hh first
        int h = 1;
        char h1 = time.charAt(0);
        char h2 = time.charAt(1);
        if (h1 == '?') {
            if (h2 == '?') {
                h = 24;
            } else if (h2 <= '3') {
                h = 3;
            } else {
                h = 2;
            }
        } else if (h2 == '?') {
            if (h1 <= '1') {
                h = 10;
            } else {
                h = 4;
            }
        }
        // settle mm
        int m = 1;
        char m1 = time.charAt(3);
        char m2 = time.charAt(4);
        if (m1 == '?') {
            m *= 6;
        }
        if (m2 == '?') {
            m *= 10;
        }
        return h * m;
    }
}
