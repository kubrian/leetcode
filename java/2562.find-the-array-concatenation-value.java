class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n = nums.length;
        long res = 0;
        for (int i = 0; i < n / 2; i++) {
            res += Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[n - i - 1]));
        }

        if (n % 2 == 1) {
            res += nums[n / 2];
        }

        return res;
    }
}
