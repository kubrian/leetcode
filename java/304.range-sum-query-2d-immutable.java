class NumMatrix {

    int[][] upTo;

    public NumMatrix(int[][] matrix) {
        upTo = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                upTo[i][j] = matrix[i][j];
                if (i > 0) {
                    upTo[i][j] += upTo[i - 1][j];
                }
                if (j > 0) {
                    upTo[i][j] += upTo[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    upTo[i][j] -= upTo[i - 1][j - 1];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = upTo[row2][col2];
        if (row1 > 0) {
            sum -= upTo[row1 - 1][col2];
        }
        if (col1 > 0) {
            sum -= upTo[row2][col1 - 1];
        }
        if (row1 > 0 && col1 > 0) {
            sum += upTo[row1 - 1][col1 - 1];
        }
        return sum;
    }
}
