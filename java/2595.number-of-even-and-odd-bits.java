class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        boolean isEven = true;
        while (n > 0) {
            if (n % 2 == 1) {
                if (isEven) {
                    even++;
                } else {
                    odd++;
                }
            }
            isEven = !isEven;
            n /= 2;
        }
        return new int[] {even, odd};
    }
}
