class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        int[] targetCount = new int[26];
        for (char c : target.toCharArray()) {
            targetCount[c - 'a']++;
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (targetCount[i] > 0) {
                res = Math.min(res, count[i] / targetCount[i]);
            }
        }
        return res;
    }
}
