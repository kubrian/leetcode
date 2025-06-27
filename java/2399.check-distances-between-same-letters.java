class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for (char c = 'a'; c <= 'z'; c++) {
            int idx = s.indexOf(c);
            if (idx == -1) {
                continue;
            }
            if (s.lastIndexOf(c) - idx != 1 + distance[c - 'a']) {
                return false;
            }
        }
        return true;
    }
}
