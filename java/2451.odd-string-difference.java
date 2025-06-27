import java.util.Arrays;

class Solution {
    public String oddString(String[] words) {
        // Find the difference array
        int[][] diff = new int[words.length][words[0].length() - 1];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length() - 1; j++) {
                diff[i][j] = words[i].charAt(j + 1) - words[i].charAt(j);
            }
        }
        // Check if the difference array is the same for all words
        // Make sure it is not the first or second
        if (!Arrays.equals(diff[0], diff[1])) {
            if (Arrays.equals(diff[0], diff[2])) {
                return words[1];
            } else {
                return words[0];
            }
        }

        for (int i = 2; i < diff.length; i++) {
            if (!Arrays.equals(diff[0], diff[i])) {
                return words[i];
            }
        }
        return words[0];
    }
}
