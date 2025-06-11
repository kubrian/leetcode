class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (board[i][j] == 'O') {
                    boolean[][] visited = new boolean[rows][cols];
                    if (dfs(board, i, j, visited)) {
                        fillWithX(board, visited);
                    }
                }
            }
        }
    }

    private boolean dfs(char[][] board, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        // Not surrounded if at boundary
        if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1) {
            return false;
        }
        // Not at boundary
        // Visit all neighbours that are 'O'
        boolean surr = true;

        // Left
        if (surr && board[i][j - 1] == 'O' && !visited[i][j - 1]) {
            surr &= dfs(board, i, j - 1, visited);
        }
        // Right
        if (surr && board[i][j + 1] == 'O' && !visited[i][j + 1]) {
            surr &= dfs(board, i, j + 1, visited);
        }
        // Up
        if (surr && board[i - 1][j] == 'O' && !visited[i - 1][j]) {
            surr &= dfs(board, i - 1, j, visited);
        }
        // Down
        if (surr && board[i + 1][j] == 'O' && !visited[i + 1][j]) {
            surr &= dfs(board, i + 1, j, visited);
        }
        return surr;
    }

    private void fillWithX(char[][] board, boolean[][] visited) {
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                if (visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
