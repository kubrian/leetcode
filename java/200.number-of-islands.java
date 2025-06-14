class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        if (i - 1 >= 0 && grid[i - 1][j] == '1' && !visited[i - 1][j]) {
            dfs(grid, i - 1, j, visited);
        }
        if (i + 1 < grid.length && grid[i + 1][j] == '1' && !visited[i + 1][j]) {
            dfs(grid, i + 1, j, visited);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == '1' && !visited[i][j - 1]) {
            dfs(grid, i, j - 1, visited);
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == '1' && !visited[i][j + 1]) {
            dfs(grid, i, j + 1, visited);
        }
    }
}
