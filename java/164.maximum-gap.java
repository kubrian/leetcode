import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        if (min == max) {
            return 0;
        }

        // Place into buckets (boolean array works also..., O(n) still (i.e. gap = 1))
        int width = Math.max((max - min) / (nums.length - 1), 1);
        int buckets = (max - min) / width + 1;
        int[] minBucket = new int[buckets];
        int[] maxBucket = new int[buckets];
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        for (int num : nums) {
            int bucket = (num - min) / width;
            minBucket[bucket] = Math.min(minBucket[bucket], num);
            maxBucket[bucket] = Math.max(maxBucket[bucket], num);
        }

        int maxGap = 0;
        int currMax = maxBucket[0];
        for (int i = 0; i < buckets - 1; i++) {
            if (minBucket[i + 1] != Integer.MAX_VALUE) {
                maxGap = Math.max(maxGap, minBucket[i + 1] - currMax);
                currMax = maxBucket[i + 1];
            }
        }
        return maxGap;
    }
}
