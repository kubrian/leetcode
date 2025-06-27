class Solution {
    public int minTimeToType(String word) {
        char prev = 'a';
        int res = 0;
        for (char c : word.toCharArray()) {
            int left = ((c - prev) + 26) % 26;
            int right = ((prev - c) + 26) % 26;
            res += Math.min(left, right) + 1;
            prev = c;
        }
        return res;
    }
}
