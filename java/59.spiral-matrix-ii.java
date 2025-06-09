class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int num = 1;

        while (true) {
            // Move right
            for (int i = left; i <= right; i++) {
                res[top][i] = num++;
            }
            // No more rows
            if (top == bottom) {
                break;
            }

            // Move down
            top++;
            for (int i = top; i <= bottom; i++) {
                res[i][right] = num++;
            }
            // No more columns
            if (left == right) {
                break;
            }

            // Move left
            right--;
            for (int i = right; i >= left; i--) {
                res[bottom][i] = num++;
            }
            // No more rows
            if (top == bottom) {
                break;
            }

            // Move up
            bottom--;
            for (int i = bottom; i >= top; i--) {
                res[i][left] = num++;
            }
            // No more columns
            if (left == right) {
                break;
            }

            // Move right
            left++;
        }
        return res;
    }
}
