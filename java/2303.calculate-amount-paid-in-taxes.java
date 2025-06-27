class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        int prev = 0;
        for (int i = 0; i < brackets.length; i++) {
            if (income <= brackets[i][0]) {
                tax += (income - prev) * brackets[i][1] / 100.0;
                break;
            } else {
                tax += (brackets[i][0] - prev) * brackets[i][1] / 100.0;
                prev = brackets[i][0];
            }
        }
        return tax;
    }
}
