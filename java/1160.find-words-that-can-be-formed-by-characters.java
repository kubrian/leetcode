class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for (char c : chars.toCharArray()) {
            count[c - 'a']++;
        }
        int res = 0;
        for (String word : words) {
            int[] wordCount = new int[26];
            for (char c : word.toCharArray()) {
                wordCount[c - 'a']++;
            }
            boolean valid = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > count[i]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                res += word.length();
            }
        }
        return res;
    }
}
