class Solution {
    public int maxRotateFunction(int[] nums) {
        // The difference between rotations is -sum + n*nums[k] for the k with coeff of n
        int sum = 0;
        int f = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            f += i * nums[i];
        }
        int max = f;
        for (int i = 1; i < nums.length; i++) {
            f = f + sum - nums.length * nums[nums.length - i];
            max = Math.max(max, f);
        }
        return max;
    }
}
