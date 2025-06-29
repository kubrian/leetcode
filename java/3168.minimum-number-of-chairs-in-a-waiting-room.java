class Solution {
    public int minimumChairs(String s) {
        int res = 0;
        int curr = 0;
        for (char x : s.toCharArray()) {
            if (x == 'E') {
                curr++;
            } else {
                curr--;
            }
            res = Math.max(res, curr);
        }
        return res;
    }
}
