class Solution {
    public int lastRemaining(int n) {
        boolean leftToRight = true;
        int numLeft = n;
        int stepSize = 1;
        int leftMost = 1; // Just track the leftMost = only remaining
        while (numLeft > 1) {
            if (leftToRight || numLeft % 2 == 1) {
                leftMost += stepSize;
            }
            leftToRight = !leftToRight;
            numLeft /= 2; // Eliminate first, so always rounds down
            stepSize *= 2; // Half are gone with every sweep
        }
        return leftMost;
    }
}
