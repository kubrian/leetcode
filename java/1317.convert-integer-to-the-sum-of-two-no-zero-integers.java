class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (Integer.toString(i).contains("0") || Integer.toString(j).contains("0")) {
                continue;
            }
            res = new int[] {i, j};
            break;
        }
        return res;
    }
}
