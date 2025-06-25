class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int target = sum / 3;
        int currPart = 0;
        int parts = 0;
        for (int num : arr) {
            currPart += num;
            if (currPart == target) {
                parts++;
                currPart = 0;
            }
            if (parts == 3) {
                return true;
            }
        }

        return false;
    }
}
