import java.util.Arrays;

class Solution {
    public int getMaximumGenerated(int n) {
        // Just make and max
        if (n == 0) {
            return 0;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            } else {
                arr[i] = arr[i / 2] + arr[i / 2 + 1];
            }
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}
