class Solution {
    public int totalMoney(int n) {
        int fullWeeks = n / 7;
        int leftDays = n % 7;
        return (28 * fullWeeks) + (7 * fullWeeks * (fullWeeks - 1) / 2)
                + (leftDays * (leftDays + 1) / 2) + (leftDays * fullWeeks);
    }
}
