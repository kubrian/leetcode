import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Bulk of the work is done in addDigit.
     */
    public String intToRoman(int num) {
        Map<Integer, Character> charMap = new HashMap<>();
        charMap.put(1, 'I');
        charMap.put(5, 'V');
        charMap.put(10, 'X');
        charMap.put(50, 'L');
        charMap.put(100, 'C');
        charMap.put(500, 'D');
        charMap.put(1000, 'M');

        StringBuilder sb = new StringBuilder();

        addDigit(charMap, sb, (num / 1000) % 10, 1000);
        addDigit(charMap, sb, (num / 100) % 10, 100);
        addDigit(charMap, sb, (num / 10) % 10, 10);
        addDigit(charMap, sb, num % 10, 1);

        return sb.toString();
    }

    /**
     * Isolate the 3 cases: 9/4 (= 10 - 1), >= 5 (= 5 + ...), < 5 (= ...).
     */
    private void addDigit(Map<Integer, Character> charMap, StringBuilder sb, int val, int mult) {
        if (val == 9 || val == 4) {
            sb.append(charMap.get(mult)).append(charMap.get((val + 1) * mult));
            val = 0;
        } else if (val >= 5) {
            sb.append(charMap.get(5 * mult));
            val -= 5;
        }
        for (int i = 0; i < val; i++) {
            sb.append(charMap.get(mult));
        }
    }
}