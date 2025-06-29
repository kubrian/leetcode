class Solution {
    public int minimumSum(int[] nums) {
        boolean found = false;
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] >= nums[j]) {
                    continue;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] <= nums[k]) {
                        continue;
                    }
                    sum = Math.min(sum, nums[i] + nums[j] + nums[k]);
                    found = true;
                }
            }
        }
        return found ? sum : -1;
    }
}
