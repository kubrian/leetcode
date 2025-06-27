class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char ans = keysPressed.charAt(0);
        int max = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            if (releaseTimes[i] - releaseTimes[i - 1] > max) {
                max = releaseTimes[i] - releaseTimes[i - 1];
                ans = keysPressed.charAt(i);
            } else if (releaseTimes[i] - releaseTimes[i - 1] == max
                    && keysPressed.charAt(i) > ans) {
                ans = keysPressed.charAt(i);
            }
        }
        return ans;
    }
}
