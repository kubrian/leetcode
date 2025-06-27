class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            count += digitSum(i);
        }
        return count;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 2 == 0 ? 1 : 0;
    }
}
