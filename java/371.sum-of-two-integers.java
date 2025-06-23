
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            // Take common bits to x2 later
            int carry = a & b;
            // Add everything else (works for 00 01 10 but not 11)
            a = a ^ b;
            // Shift carry
            b = carry << 1;
        }
        return a;
    }
}
