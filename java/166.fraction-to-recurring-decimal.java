import java.util.HashMap;
import java.util.Map;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        // Trivial case
        if (numerator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();

        // Negatives
        boolean neg = numerator < 0 ^ denominator < 0;
        if (neg) {
            sb.append('-');
        }

        // The integer part
        // long to get around edge cases...
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        sb.append(num / den);
        num = num % den;

        if (num == 0) {
            return sb.toString();
        }

        // The fraction part
        sb.append(".");

        // Need to remember where we seen the digit
        Map<Long, Integer> seen = new HashMap<>();
        while (num != 0) {
            if (seen.containsKey(num)) {
                sb.insert(seen.get(num), "(");
                sb.append(")");
                break;
            }
            seen.put(num, sb.length());
            num *= 10;
            sb.append(num / den);
            num = num % den;
        }
        return sb.toString();
    }
}
