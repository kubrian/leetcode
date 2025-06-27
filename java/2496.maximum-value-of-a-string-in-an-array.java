class Solution {
    public int maximumValue(String[] strs) {
        int res = 0;
        for (String s : strs) {
            try {
                res = Math.max(res, Integer.parseInt(s));
            } catch (NumberFormatException e) {
                res = Math.max(res, s.length());
            }
        }
        return res;
    }
}
