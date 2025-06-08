class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int counts = 0;
        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum += nums[j];
                if (currSum == goal) {
                    counts++;
                } else if (currSum > goal) {
                    break;
                }
            }
        }
        return counts;
    }
}
