class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        int r = 0;
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                r++;
            } else {
                l++;
            }
            if (r == l) {
                res++;
            }
        }
        return res;
    }
}
