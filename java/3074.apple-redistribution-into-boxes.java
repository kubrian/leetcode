import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for (int i = 0; i < apple.length; i++) {
            sum += apple[i];
        }
        int boxes = 0;
        while (sum > 0) {
            sum -= capacity[capacity.length - 1 - boxes];
            boxes += 1;
        }
        return boxes;
    }
}
