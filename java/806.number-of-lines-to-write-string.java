class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] res = new int[] {1, 0};
        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];
            if (res[1] + width > 100) {
                res[0]++;
                res[1] = width;
            } else {
                res[1] += width;
            }
        }
        return res;
    }
}
