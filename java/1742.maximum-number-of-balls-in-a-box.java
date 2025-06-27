import java.util.Arrays;

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[46]; // 99999 -> 45
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int x = i;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            count[sum]++;
        }
        return Arrays.stream(count).max().getAsInt();
    }
}
