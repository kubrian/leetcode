import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long happy = 0;
        for (int i = 0; i < k; i++) {
            int curr = happiness[happiness.length - 1 - i] - i;
            happy += curr > 0 ? curr : 0;
        }
        return happy;
    }
}
