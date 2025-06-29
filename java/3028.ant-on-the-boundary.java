class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int curr = 0;
        int res = 0;
        for (int n : nums) {
            curr += n;
            if (curr == 0) {
                res++;
            }
        }
        return res;
    }
}
