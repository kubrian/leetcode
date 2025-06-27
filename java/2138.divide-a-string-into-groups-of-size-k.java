class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int target = (s.length() + k - 1) / k;
        String[] ans = new String[target];
        for (int i = 0; i < target; i++) {
            ans[i] = s.substring(i * k, Math.min((i + 1) * k, n));
            if (ans[i].length() < k) {
                ans[i] += String.valueOf(fill).repeat(k - ans[i].length());
            }
        }
        return ans;
    }
}
