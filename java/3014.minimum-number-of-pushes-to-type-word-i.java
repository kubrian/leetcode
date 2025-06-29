class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        if (word.length() <= 8) {
            return len;
        } else if (word.length() <= 16) {
            return 8 + (len - 8) * 2;
        } else if (word.length() <= 24) {
            return 24 + (len - 16) * 3;
        } else {
            return 48 + (len - 24) * 4;
        }
    }
}
