class Solution {
    public int maxPower(String s) {
        int res = 1;
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                res++;
                max = Math.max(max, res);
            } else {
                res = 1;
            }
        }
        return max;
    }
}
