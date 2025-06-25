import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == min) {
                    boolean isLucky = true;
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][j] > min) {
                            isLucky = false;
                            break;
                        }
                    }
                    if (isLucky) {
                        res.add(min);
                    }
                }
            }
        }
        return res;
    }
}
