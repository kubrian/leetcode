import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        for (char c = s.charAt(0); c <= s.charAt(3); c++) {
            for (char d = s.charAt(1); d <= s.charAt(4); d++) {
                res.add(c + "" + d);
            }
        }
        return res;
    }
}
