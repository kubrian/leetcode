class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Exercise in binary search
        int m = matrix.length;
        int n = matrix[0].length;

        // Find smallest k such that x >= target for all x >= k
        int left = 0;
        int right = m * n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int row = mid / n;
            int col = mid % n;
            if (matrix[row][col] < target) {
                left = mid + 1; // mid is not possible
            } else {
                right = mid;
            }
        }
        int row = left / n;
        int col = left % n;
        return row < m && col < n && matrix[row][col] == target;
    }
}
