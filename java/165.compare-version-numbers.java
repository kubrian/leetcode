import java.util.Arrays;

class Solution {
    public int compareVersion(String version1, String version2) {
        int[] v1 = Arrays.stream(version1.split("\\.")).mapToInt(Integer::parseInt).toArray();
        int[] v2 = Arrays.stream(version2.split("\\.")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < Math.max(v1.length, v2.length); i++) {
            int num1 = i < v1.length ? v1[i] : 0;
            int num2 = i < v2.length ? v2[i] : 0;
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }
        return 0;
    }
}
