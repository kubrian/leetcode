class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int minIndex = events[0][0];
        int maxTime = events[0][1];

        for (int i = 1; i < events.length; i++) {
            int diff = events[i][1] - events[i - 1][1];
            if (diff > maxTime) {
                minIndex = events[i][0];
                maxTime = diff;
            } else if (diff == maxTime) {
                minIndex = Math.min(minIndex, events[i][0]);
            }
        }
        return minIndex;
    }
}
