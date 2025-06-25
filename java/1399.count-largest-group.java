import java.util.Arrays;

class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37]; // 9999 -> 36
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int x = i;
            // Much easier to do this than to think of all edge cases for 9 -> 10
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            count[sum]++;
        }
        int max = Arrays.stream(count).max().getAsInt();
        return (int) Arrays.stream(count).filter(c -> c == max).count();
    }
}
