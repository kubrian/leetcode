class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0){
            return 1;
        }
        int res = 10;
        int prev = 9;
        for (int i = 1; i < n; i++) {
            prev *= 9 - i + 1;
            res += prev;
        }
        return res;
    }
}
