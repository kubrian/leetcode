class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                // Delete some char
                freq[i]--;
                // Check array
                int c = 0;
                boolean ok = true;
                for (int x : freq) {
                    if (x != 0) {
                        if (c != 0 && x != c) {
                            ok = false;
                            break;
                        }
                        c = x;
                    }
                }
                if (ok) {
                    return true;
                }
                // Add it back
                freq[i]++;
            }
        }
        return false;
    }
}
