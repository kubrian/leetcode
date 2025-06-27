class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // nums[k] times in front, nums[k] - 1 times in back
        int res = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                res += Math.min(tickets[i], tickets[k]);
            } else {
                res += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return res;
    }
}
