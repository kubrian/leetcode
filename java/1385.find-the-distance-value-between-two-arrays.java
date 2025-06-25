import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int num : arr1) {
            int left = 0;
            int right = arr2.length - 1;
            boolean found = false;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (Math.abs(num - arr2[mid]) <= d) {
                    found = true;
                    break;
                } else if (num < arr2[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (!found) {
                count++;
            }
        }
        return count;
    }
}
