class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        int carry = 0;
        // Either not done
        while (pos < a.length() || pos < b.length()) {
            int f = pos < a.length() ? a.charAt(a.length() - 1 - pos) - '0' : 0;
            int s = pos < b.length() ? b.charAt(b.length() - 1 - pos) - '0' : 0;
            int curr = f + s + carry;
            if (curr > 1) {
                carry = 1;
                sb.append(curr % 2);
            } else {
                carry = 0;
                sb.append(curr);
            }
            pos++;
        }
        if (carry == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
