class Solution {
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i][0];
            int y = moves[i][1];
            if (i % 2 == 0) {
                board[x][y] = 'X';
            } else {
                board[x][y] = 'O';
            }
        }

        for (int i = 0; i < 3; i++) {
            // Check rows
            if (board[i][0] != '\0' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0] == 'X' ? "A" : "B";
            }
            // Check columns
            if (board[0][i] != '\0' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i] == 'X' ? "A" : "B";
            }
        }

        // Check diagonals
        if (board[0][0] != '\0' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return board[0][0] == 'X' ? "A" : "B";
        }
        if (board[0][2] != '\0' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return board[0][2] == 'X' ? "A" : "B";
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}
