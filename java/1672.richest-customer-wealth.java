import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        // Streams are sacred but slow
        return Arrays.stream(accounts).mapToInt(a -> Arrays.stream(a).sum()).max().orElse(0);
    }
}
