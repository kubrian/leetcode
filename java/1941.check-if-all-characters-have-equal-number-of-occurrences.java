class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }        
        int first = -1;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                if (first == -1) {
                    first = count[i];
                } else if (count[i] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}
