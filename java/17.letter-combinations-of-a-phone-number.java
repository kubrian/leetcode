import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, List<String>> map = new HashMap<>();
        map.put('2', List.of("a", "b", "c"));
        map.put('3', List.of("d", "e", "f"));
        map.put('4', List.of("g", "h", "i"));
        map.put('5', List.of("j", "k", "l"));
        map.put('6', List.of("m", "n", "o"));
        map.put('7', List.of("p", "q", "r", "s"));
        map.put('8', List.of("t", "u", "v"));
        map.put('9', List.of("w", "x", "y", "z"));

        List<String> res = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            res = cartesian(res, map.get(digits.charAt(i)));
        }
        return res;
    }

    private List<String> cartesian(List<String> a, List<String> b) {
        if (a.isEmpty())
            return b;
        if (b.isEmpty())
            return a;
        List<String> res = new ArrayList<>();
        for (String x : a) {
            for (String y : b) {
                res.add(x + y);
            }
        }
        return res;
    }
}