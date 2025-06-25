import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> outFrom = new HashSet<>();
        for (List<String> path : paths) {
            outFrom.add(new String(path.get(0)));
        }
        String res = "";
        for (List<String> path : paths) {
            if (!outFrom.contains(new String(path.get(1)))) {
                res = path.get(1);
                break;
            }
        }
        return res;
    }
}
