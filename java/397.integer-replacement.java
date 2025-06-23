class Solution {
    public int integerReplacement(int n) {
        // max value is special
        if (n == Integer.MAX_VALUE) {
            return 32; // (2^31 - 1) -> +1 -> /2 (31 times) -> 1)
        }
        int count = 0;
        // Optimal path is to move towards multiple of 4
        // except for 3 which can directly move to 2
        while (n != 1) {
            if (n % 2 == 0) { // even
                n /= 2;
            } else if (n == 3) {
                n = 2;
            } else if (n % 4 == 3) {
                n++;
            } else {
                n--;
            }
            count++;
        }
        return count;
    }
}
