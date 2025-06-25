class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Suppose strs are k * m, k * n.
        // Then k * m + k * n = k * (m + n) = k * n + k * m.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
