class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for (String word : words) {
            if (word.chars().allMatch(c -> allowed.indexOf((char) c) != -1)) {
                res++;
            }
        }
        return res;
    }
}
