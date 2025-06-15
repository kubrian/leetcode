import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        for (int i = n - 1; i >= 0 && citations[i] >= h + 1; i--) {
            h++;
        }
        return h;
    }
}
