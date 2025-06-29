class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxDivScore = 0;
        int maxDiv = divisors[0];
        for (int d : divisors) {
            int divScore = 0;
            for (int n : nums) {
                if (n % d == 0) {
                    divScore++;
                }
            }
            if (divScore > maxDivScore || (divScore == maxDivScore && d < maxDiv)) {
                maxDivScore = divScore;
                maxDiv = d;
            }
        }
        return maxDiv;
    }
}
