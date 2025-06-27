class Solution {
    public String reformatNumber(String number) {
        number = number.replaceAll("\\D", "");
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx + 4 < number.length()) {
            sb.append(number, idx, idx + 3).append('-');
            idx += 3;
        }
        if (number.length() - idx <= 3) {
            sb.append(number, idx, number.length());
        } else {
            sb.append(number, idx, idx + 2).append('-').append(number, idx + 2, idx + 4);
        }
        return sb.toString();
    }
}
