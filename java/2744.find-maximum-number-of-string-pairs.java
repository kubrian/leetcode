class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        boolean[] used = new boolean[words.length];
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            if (used[i]) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (used[j]) {
                    continue;
                }
                if (words[i].equals(new StringBuilder(words[j]).reverse().toString())) {
                    used[i] = true;
                    used[j] = true;
                    res++;
                }
            }
        }
        return res;
    }
}
