class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int cDiff = Math.abs(coordinate1.charAt(0) - coordinate2.charAt(0));
        int rDiff = Math.abs(coordinate1.charAt(1) - coordinate2.charAt(1));
        return (cDiff + rDiff) % 2 == 0;
    }
}
