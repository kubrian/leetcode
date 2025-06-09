class Solution {
    public int minDistance(String word1, String word2) {
        // Attempt 3: DP
        int l1 = word1.length();
        int l2 = word2.length();

        int[][] editDist = new int[word1.length() + 1][word2.length() + 1];

        // i, j denote substring length (for "", "d" "cd" "bcd", ...)
        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
                // First characters are word1[l1 -i], word2[l2 - j]
                if (i == 0 || j == 0) {
                    // Either is empty
                    editDist[i][j] = i + j;
                } else if (word1.charAt(l1 - i) == word2.charAt(l2 - j)) {
                    // First characters are equal
                    editDist[i][j] = editDist[i - 1][j - 1];
                } else {
                    // First characters are not equal, insert, delete, replace
                    editDist[i][j] = 1 + Math.min(Math.min(editDist[i - 1][j], editDist[i][j - 1]),
                            editDist[i - 1][j - 1]);
                }
            }
        }
        return editDist[l1][l2];
    }
}
