import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        // Create all possibilities of first two numbers
        for (int i = 1; i < n; i++) {
            String first = num.substring(0, i);
            // First cannot start with 0 but can be 0
            if (first.startsWith("0") && first.length() > 1) {
                return false;
            }
            BigInteger firstNum = new BigInteger(first);
            for (int j = i + 1; j < n; j++) {
                String second = num.substring(i, j);
                // Second cannot start with 0 but can be 0
                if (second.startsWith("0") && second.length() > 1) {
                    continue;
                }
                BigInteger secondNum = new BigInteger(second);
                if (isAdditiveNumber(firstNum, secondNum, j, num)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAdditiveNumber(BigInteger firstNum, BigInteger secondNum, int rest,
            String num) {
        while (rest < num.length()) {
            BigInteger thirdNum = firstNum.add(secondNum);
            String third = thirdNum.toString();
            // No need to check for 0
            if (!num.startsWith(third, rest)) {
                return false;
            }
            firstNum = secondNum;
            secondNum = thirdNum;
            rest += third.length();
        }
        return true;
    }
}
