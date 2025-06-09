import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (true) {
            // Move right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            // No more rows
            if (top == bottom) {
                break;
            }

            // Move down
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            // No more columns
            if (left == right) {
                break;
            }

            // Move left
            right--;
            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            // No more rows
            if (top == bottom) {
                break;
            }

            // Move up
            bottom--;
            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            // No more columns
            if (left == right) {
                break;
            }
            left++;
        }
        return res;
    }
}
