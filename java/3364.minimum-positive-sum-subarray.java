import java.util.List;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int sum = 0;
            for (int j = i; j < nums.size() && j <= i + r - 1; j++) {
                sum += nums.get(j);
                if (sum > 0 && j >= i + l - 1) {
                    res = Math.min(res, sum);
                }
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
