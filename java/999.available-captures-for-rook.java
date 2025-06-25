class Solution {
    public int numRookCaptures(char[][] board) {
        int res = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    // Go all 4 directions until hit 'B' or 'p'
                    int l = i;
                    while (--l >= 0) {
                        if (board[l][j] == 'p') {
                            res++;
                            break;
                        } else if (board[l][j] == 'B') {
                            break;
                        }
                    }
                    int r = i;
                    while (++r < board.length) {
                        if (board[r][j] == 'p') {
                            res++;
                            break;
                        } else if (board[r][j] == 'B') {
                            break;
                        }
                    }
                    int u = j;
                    while (--u >= 0) {
                        if (board[i][u] == 'p') {
                            res++;
                            break;
                        } else if (board[i][u] == 'B') {
                            break;
                        }
                    }
                    int d = j;
                    while (++d < board[0].length) {
                        if (board[i][d] == 'p') {
                            res++;
                            break;
                        } else if (board[i][d] == 'B') {
                            break;
                        }
                    }
                }
            }
        }
        return res;
    }
}
