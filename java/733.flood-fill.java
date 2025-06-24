class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Some traversal will do
        dfs(image, sr, sc, color, image[sr][sc], new boolean[image.length][image[0].length]);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int color, int oldColor, boolean[][] visited) {
        visited[sr][sc] = true;
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = color;
            if (sr > 0 && !visited[sr - 1][sc]) {
                dfs(image, sr - 1, sc, color, oldColor, visited);
            }
            if (sr < image.length - 1 && !visited[sr + 1][sc]) {
                dfs(image, sr + 1, sc, color, oldColor, visited);
            }
            if (sc > 0 && !visited[sr][sc - 1]) {
                dfs(image, sr, sc - 1, color, oldColor, visited);
            }
            if (sc < image[0].length - 1 && !visited[sr][sc + 1]) {
                dfs(image, sr, sc + 1, color, oldColor, visited);
            }
        }
    }
}
