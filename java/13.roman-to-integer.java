import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            int val = charMap.get(s.charAt(i));
            res += val < charMap.get(s.charAt(i + 1)) ? -val : val;
        }
        res += charMap.get(s.charAt(s.length() - 1));
        return res;
    }
}