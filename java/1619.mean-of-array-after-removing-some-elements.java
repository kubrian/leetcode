import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return Arrays.stream(arr, n / 20, n - n / 20).average().getAsDouble();        
    }
}
