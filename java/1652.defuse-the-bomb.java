class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int sum = 0;
        // Create window (negative and positive)
        if (k < 0) {
            for (int i = k + n; i < n; i++) {
                sum += code[i];
            }
        } else {
            for (int i = 1; i <= k; i++) {
                sum += code[i];
            }
        }
        int res[] = new int[code.length];
        for (int i = 0; i < code.length; i++) {
            res[i] = sum;
            // Remove last and add new
            int removeIdx = k < 0 ? (n + k + i) % n : (i + 1) % n;
            int addIdx = k < 0 ? i : (i + 1 + k) % n;
            sum -= code[removeIdx];
            sum += code[addIdx];
        }
        return res;
    }
}
