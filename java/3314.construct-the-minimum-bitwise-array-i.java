import java.util.List;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 2) {
                res[i] = -1;
            } else {
                // Find the rightmost 0 bit, which will be set by the xor
                int pos = Integer.lowestOneBit(nums.get(i) + 1) >> 1;
                // So we can remove this
                res[i] = nums.get(i) - pos;
            }
        }
        return res;
    }
}
