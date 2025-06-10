import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        travel(s, new ArrayList<>(), 1, res);
        return res;
    }

    private void travel(String s, List<Integer> comb, int k, List<String> res) {
        // . will have specified index when inserted
        // Hit 4
        if (comb.size() == 3) {
            if (isValid(s.substring(comb.get(2)))) {
                StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0, comb.get(0)));
                sb.append('.');
                sb.append(s.substring(comb.get(0), comb.get(1)));
                sb.append('.');
                sb.append(s.substring(comb.get(1), comb.get(2)));
                sb.append('.');
                sb.append(s.substring(comb.get(2)));
                res.add(sb.toString());
            }
            return;
        }
        // Too far back
        if (k >= s.length()) {
            return;
        }
        // Insert here, if valid
        int start = comb.isEmpty() ? 0 : comb.get(comb.size() - 1);
        if (isValid(s.substring(start, k))) {
            comb.add(k);
            travel(s, comb, k + 1, res);
            comb.remove(comb.size() - 1);
        }

        // Do not insert here
        travel(s, comb, k + 1, res);
    }

    private boolean isValid(String num) {
        return num.length() == 1 || !num.isEmpty() && !num.startsWith("0") && num.length() <= 3
                && Integer.parseInt(num) < 256;
    }
}
