class Solution {
    public int minOperations(String s) {
        int m1 = 0;
        int m2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                if (c == '0') {
                    m1++;
                } else {
                    m2++;
                }
            } else {
                if (c == '1') {
                    m1++;
                } else {
                    m2++;
                }
            }
        }
        return Math.min(m1, m2);
    }
}
