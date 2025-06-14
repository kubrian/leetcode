class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // We get to skip certain rows...
        for (int[] row : matrix) {
            if (binarySearch(row, target)) {
                return true;
            }
        }
        return false;
    }

    private boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1; // Cannot be mid
            } else {
                right = mid - 1; // Cannot be mid
            }
        }
        return false;
    }
}
