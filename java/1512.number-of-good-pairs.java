class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101]; // Up to 100
        for (int num : nums) {
            freq[num]++;
        }
        int res = 0;
        for (int i = 0; i < freq.length; i++) {
            res += freq[i] * (freq[i] - 1) / 2;
        }
        return res;
    }
}
