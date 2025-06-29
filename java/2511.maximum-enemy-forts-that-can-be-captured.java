class Solution {
    public int captureForts(int[] forts) {
        int res = 0;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1) {
                int left = i - 1;
                while (left >= 0 && forts[left] == 0) {
                    left--;
                }
                if (left >= 0 && forts[left] == -1) {
                    res = Math.max(res, i - left - 1);
                }
                int right = i + 1;
                while (right < forts.length && forts[right] == 0) {
                    right++;
                }
                if (right < forts.length && forts[right] == -1) {
                    res = Math.max(res, right - i - 1);
                }
            }
        }
        return res;
    }
}
