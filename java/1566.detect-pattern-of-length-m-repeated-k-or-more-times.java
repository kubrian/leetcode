class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        // find k-1 * m consecutive pairs
        int count = 0;
        for (int i = 0; i + m < arr.length; i++) {
            if (arr[i] == arr[i + m]) {
                count++;
            } else {
                count = 0;
            }
            if (count == (k - 1) * m) {
                return true;
            }
        }
        return false;
    }
}
