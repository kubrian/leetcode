class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currStreak = 0;
        for (int num : nums) {
            if (num == 1) {
                currStreak++;
            } else {
                currStreak = 0;
            }
            max = Math.max(max, currStreak);
        }
        return max;
    }
}
