class Solution {
    public boolean lemonadeChange(int[] bills) {
        // Try to give as much large notes as possible
        int fives = 0;
        int tens = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fives++; // No change
            } else if (bills[i] == 10) {
                // must give 5
                if (fives > 0) {
                    fives--;
                    tens++;
                } else {
                    return false;
                }
            } else {
                // give 10 + 5 or 3 of 5
                if (fives > 0 && tens > 0) {
                    fives--;
                    tens--;
                } else if (fives >= 3) {
                    fives -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
