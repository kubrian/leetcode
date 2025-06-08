class Solution {
    public int pivotInteger(int n) {
        int lowerX = 1;
        int upperX = n;
        int lowerSum = 1;
        int upperSum = n;

        while (lowerX <= upperX) {
            while (lowerSum < upperSum)
                lowerSum += ++lowerX;
            while (lowerSum > upperSum)
                upperSum += --upperX;
            if (lowerSum == upperSum) {
                if (lowerX == upperX)
                    return lowerX;
                lowerSum += ++lowerX;
                upperSum += --upperX;
            }
        }
        return -1;
    }
}
