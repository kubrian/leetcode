class Solution {
    public int findSpecialInteger(int[] arr) {
        // Since it's sorted, just traverse and count
        int n = arr.length;
        int count = 1;
        int num = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == num) {
                count++;
            } else {
                count = 1;
                num = arr[i];
            }
            if (count > n / 4) {
                return num;
            }
        }
        return num;
    }
}
