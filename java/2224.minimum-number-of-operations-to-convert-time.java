class Solution {
    public int convertTime(String current, String correct) {
        int cur = Integer.parseInt(current.substring(0, 2)) * 60
                + Integer.parseInt(current.substring(3));
        int cor = Integer.parseInt(correct.substring(0, 2)) * 60
                + Integer.parseInt(correct.substring(3));
        int diff = (cor + 24 * 60 - cur) % (24 * 60);
        int res = 0;
        while (diff > 0) {
            if (diff >= 60) {
                res += diff / 60;
                diff = diff % 60;
            } else if (diff >= 15) {
                res += diff / 15;
                diff = diff % 15;
            } else if (diff >= 5) {
                res += diff / 5;
                diff = diff % 5;
            } else {
                res += diff;
                diff = 0;
            }
        }
        return res;
    }
}
