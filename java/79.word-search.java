class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0, new boolean[rows][cols])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int k, boolean[][] used) {
        // Made the word
        if (k == word.length()) {
            return true;
        }
        // Invalid/Incorrect cases
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || word.charAt(k) != board[i][j] || used[i][j]) {
            return false;
        }

        // Current character matches, check all four directions
        used[i][j] = true;
        if (dfs(board, word, i - 1, j, k + 1, used) || dfs(board, word, i + 1, j, k + 1, used)
                || dfs(board, word, i, j - 1, k + 1, used)
                || dfs(board, word, i, j + 1, k + 1, used)) {
            return true;
        }
        // Invalid, so just backtrack
        used[i][j] = false;
        return false;
    }
}
