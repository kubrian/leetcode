class Solution {
    public String removeDigit(String number, char digit) {
        int lastIdx = number.lastIndexOf(digit);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit && i + 1 < number.length()
                    && number.charAt(i) < number.charAt(i + 1)) {
                return number.substring(0, i) + number.substring(i + 1);
            }
        }
        return number.substring(0, lastIdx) + number.substring(lastIdx + 1);
    }
}
