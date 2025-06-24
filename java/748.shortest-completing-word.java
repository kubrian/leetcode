class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] count = new int[26];
        for (char c : licensePlate.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }
        String res = "";

        for (String word : words) {
            int[] count2 = new int[26];
            for (char c : word.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    count2[c - 'a']++;
                }
            }
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (count2[i] < count[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag && (res.isEmpty() || word.length() < res.length())) {
                res = word;
            }
        }
        return res;
    }
}
