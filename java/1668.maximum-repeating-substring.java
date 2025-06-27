class Solution {
    public int maxRepeating(String sequence, String word) {
        int res = -1;
        while (sequence.indexOf(word.repeat(++res)) != -1) {
        }
        // Remove the last ++
        return res - 1;
    }
}
