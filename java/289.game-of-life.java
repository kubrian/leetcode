class Solution {
    public void gameOfLife(int[][] board) {
        // Can't we just use booleans?
        // Use extra bit of information in int to store more info
        // Technically O(n) space if booleans, but O(1) for ints
        final int BIT_CURR_MASK = 0b01;
        final int BIT_NEXT_MASK = 0b10;

        int rows = board.length;
        int cols = board[0].length;

        // Calculate next state
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int aliveNeighbours = 0;
                for (int dx = -1; dx <= 1; dx++) {
                    if (i + dx < 0 || i + dx >= rows) {
                        continue;
                    }
                    for (int dy = -1; dy <= 1; dy++) {
                        if (dx == 0 && dy == 0 || j + dy < 0 || j + dy >= cols) {
                            continue;
                        }
                        aliveNeighbours += (board[i + dx][j + dy] & BIT_CURR_MASK);
                    }
                }
                if (aliveNeighbours == 3 || (aliveNeighbours == 2 && board[i][j] == 1)) {
                    board[i][j] |= BIT_NEXT_MASK;
                }
            }
        }

        // Update state
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] >>= 1;
            }
        }
    }
}
