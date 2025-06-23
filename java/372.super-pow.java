class Solution {
    public int superPow(int a, int[] b) {
        int m = 1337;
        a = a % m; // Simplify
        int res = 1; // To multiply digit by digit
        for (int i = b.length - 1; i >= 0; i--) {
            res = (res * powMod(a, b[i], m)) % m;
            a = powMod(a, 10, m);
        }
        return res % m;
    }

    private int powMod(int a, int b, int m) {
        if (b == 0) {
            return 1;
        }
        int half = powMod(a, b / 2, m);
        if (b % 2 == 0) {
            return (half * half) % m;
        } else {
            return ((half * half) % m * a) % m;
        }
    }
}
