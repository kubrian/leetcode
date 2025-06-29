class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int larger = grid.length;
        int smaller = 2;
        for (int i = 0; i < larger - smaller + 1; i++) {
            for (int j = 0; j < larger - smaller + 1; j++) {
                int count = 0;
                for (int k = 0; k < smaller; k++) {
                    for (int l = 0; l < smaller; l++) {
                        if (grid[i + k][j + l] == 'W') {
                            count++;
                        }
                    }
                }
                if (count != 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
