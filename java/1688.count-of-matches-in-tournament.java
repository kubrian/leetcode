class Solution {
    public int numberOfMatches(int n) {
        int res = 0;
        while (n > 1) {
            res += n / 2; // Freeloader has no matches
            n = (n + 1) / 2;
        }
        return res;
    }
}
