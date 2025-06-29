class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSymmetric(int num) {
        String numStr = String.valueOf(num);
        if (numStr.length() % 2 == 1) {
            return false;
        }

        int forwardSum = 0;
        int reverseSum = 0;

        for (int i = 0; i < numStr.length() / 2; i++) {
            forwardSum += numStr.charAt(i) - '0';
            reverseSum += numStr.charAt(numStr.length() - 1 - i) - '0';
        }
        return forwardSum == reverseSum;
    }
}
