class Solution {
    public int minimumMoves(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                res++;
                i += 2;
            }
        }
        return res;
    }
}
