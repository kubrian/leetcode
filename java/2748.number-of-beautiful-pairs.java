class Solution {
    public int countBeautifulPairs(int[] nums) {
        int[] firstDigits = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            firstDigits[i] = firstDigit(nums[i]);
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (gcd(firstDigits[i], nums[j] % 10) == 1) {
                    res++;
                }
            }
        }
        return res;

    }

    private int firstDigit(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
