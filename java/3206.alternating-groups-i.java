class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[(i + 1) % n] && colors[i] != colors[(i - 1 + n) % n]) {
                res++;
            }
        }
        return res;
    }
}
