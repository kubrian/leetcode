import java.util.Arrays;

class Solution {
    public int minElement(int[] nums) {
        return Arrays.stream(nums).map(this::sumDigits).min().orElse(0);
    }

    private int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
