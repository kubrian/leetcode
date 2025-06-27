class Solution {
    public int arraySign(int[] nums) {
        int sgn = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                sgn *= -1;
            }
        }
        return sgn;
    }
}
