class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            char maxDigit = 0;
            char[] digits = Integer.toString(nums[i]).toCharArray();
            for (char x : digits) {
                maxDigit = x > maxDigit ? x : maxDigit;
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < digits.length; j++) {
                sb.append(maxDigit);
            }
            sum += Integer.parseInt(sb.toString());
        }
        return sum;
    }
}
