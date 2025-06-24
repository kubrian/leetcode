class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0; // Values are known
        int secondMax = 0; // Values are known, else use Integer and null
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= 2 * secondMax ? maxIndex : -1;
    }
}
