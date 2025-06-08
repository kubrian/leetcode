import java.util.Arrays;

class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        Integer[] indices = new Integer[nums.length];
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
            sum += nums[i];
        }

        // Sort indices by value of input
        Arrays.sort(indices, (i, j) -> Integer.compare(nums[i], nums[j])); // Works

        boolean[] marked = new boolean[nums.length];
        int pos = 0;
        long[] res = new long[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int pos1 = queries[i][0];
            if (!marked[pos1]) {
                sum -= nums[pos1];
                marked[pos1] = true;
            }
            for (int j = 0; j < queries[i][1] && pos < nums.length;) {
                if (!marked[indices[pos]]) {
                    sum -= nums[indices[pos]];
                    marked[indices[pos]] = true;
                    j++;
                }
                pos++;
            }
            res[i] = sum;
        }
        return res;
    }
}
