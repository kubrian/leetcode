import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int res = 0;
        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {
            int units = Math.min(truckSize, boxTypes[i][0]);
            res += units * boxTypes[i][1];
            truckSize -= units;
        }
        return res;
    }
}
