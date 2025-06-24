class Solution {
    public int countBinarySubstrings(String s) {
        int prevConsec = 0;
        int currConsec = 1;
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currConsec++;
            } else {
                prevConsec = currConsec;
                currConsec = 1;
            }
            if (currConsec <= prevConsec) {
                res++;
            }
        }
        return res;
    }
}
