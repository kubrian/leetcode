class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int res = 0;
        while (mainTank >= 5) {
            mainTank -= 5;
            res += 50;
            if (additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        return res + mainTank * 10;
    }
}
