class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int res = 0;
        for (int x : batteryPercentages) {
            if (x > res) {
                res++;
            }
        }
        return res;
    }
}
