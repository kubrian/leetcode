class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] != 10) {
                return digits;
            } else {
                digits[i] = 0;
                if (i == 0) {
                    int[] res = new int[digits.length + 1];
                    res[0] = 1;
                    for (int j = 0; j < digits.length; j++) {
                        res[j + 1] = digits[j];
                    }
                    return res;
                }
            }
        }
        return digits;
    }
}
