class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int subsets = 1 << n; // 2^n
        int total = 0;
        for (int i = 0; i < subsets; i++) {
            int xor = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // include the j-th element
                    xor ^= nums[j];
                }
            }
            total += xor;
        }
        return total;
    }
}
