class Solution {
    public int maxProduct(String[] words) {
        // For each word, need to store whether it contains a specific letter
        // Then do a check between every pair

        // Use bitmasking since ints have 32 bits and there are only 26 chars
        int[] bitmasks = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                bitmasks[i] |= 1 << (c - 'a');
            }
        }

        int max = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((bitmasks[i] & bitmasks[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
