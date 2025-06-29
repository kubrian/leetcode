class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if ((i == j || i + j == nums.length - 1) && isPrime(nums[i][j])) {
                    max = Math.max(max, nums[i][j]);
                }
            }
        }
        return max;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
