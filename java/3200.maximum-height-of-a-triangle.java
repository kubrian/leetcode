class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(helper(red, blue), helper(blue, red));
    }

    private int helper(int first, int second) {
        int row = 0;
        boolean useFirst = true;
        while (true) {
            if (useFirst) {
                if (first > row) {
                    row++;
                    first -= row;
                    useFirst = false;
                } else {
                    return row;
                }
            } else {
                if (second > row) {
                    row++;
                    second -= row;
                    useFirst = true;
                } else {
                    return row;
                }
            }
        }
    }
}
