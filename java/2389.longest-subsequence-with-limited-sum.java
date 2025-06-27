import java.util.Arrays;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // Just sort and sum?
        Arrays.sort(nums);
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int index = Arrays.binarySearch(sum, queries[i] + 1);
            if (index < 0) {
                index = -index - 1;
            }
            res[i] = index;
        }
        return res;
    }
}
