class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return mapToNum(firstWord) + mapToNum(secondWord) == mapToNum(targetWord);
    }

    private int mapToNum(String w) {
        int res = 0;
        for (char c : w.toCharArray()) {
            res += c - 'a';
            res *= 10;
        }
        return res / 10;
    }
}
