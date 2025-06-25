class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int even = 0;
        int odd = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[even++] = num;
            } else {
                res[odd--] = num;
            }
        }
        return res;
    }
}
