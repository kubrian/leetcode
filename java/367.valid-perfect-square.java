class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num / i; i++) {
            if (num % i == 0 && num / i == i) {
                return true;
            }
        }        
        return false;
    }
}
