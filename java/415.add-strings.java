class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int curr = carry;
            if (i >= 0) {
                curr += num1.charAt(i) - '0';
            }
            if (j >= 0) {
                curr += num2.charAt(j) - '0';
            }
            sb.append(curr % 10);
            carry = curr / 10;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
