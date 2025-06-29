class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 1;
        for (int i = 0; i < n; i++) {
            int prod = nums[i];
            int gcd = nums[i];
            int lcm = nums[i];
            for (int j = i + 1; j < n; j++) {
                prod *= nums[j];
                gcd = gcd(gcd, nums[j]);
                lcm = lcm(lcm, nums[j]);
                if (prod == gcd * lcm) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
