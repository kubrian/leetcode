import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return search(expression, new HashMap<>());
    }

    private List<Integer> search(String exp, Map<String, List<Integer>> map) {
        // Compute only if not computed
        if (!map.containsKey(exp)) {
            // No operator present
            if (exp.indexOf("+") == -1 && exp.indexOf("-") == -1 && exp.indexOf("*") == -1) {
                map.put(exp, List.of(Integer.parseInt(exp)));
            } else {
                // Take every pair
                List<Integer> currRes = new ArrayList<>();
                for (int i = 0; i < exp.length(); i++) {
                    char ch = exp.charAt(i);
                    if (ch == '+' || ch == '-' || ch == '*') {
                        List<Integer> left = search(exp.substring(0, i), map);
                        List<Integer> right = search(exp.substring(i + 1), map);
                        for (int l : left) {
                            for (int r : right) {
                                if (ch == '+') {
                                    currRes.add(l + r);
                                } else if (ch == '-') {
                                    currRes.add(l - r);
                                } else {
                                    currRes.add(l * r);
                                }
                            }
                        }
                    }
                }
                map.put(exp, currRes);
            }
        }
        return map.get(exp);
    }
}
