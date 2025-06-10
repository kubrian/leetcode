import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> prevMin = List.of(triangle.get(0).get(0));
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> currMin = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int curr = triangle.get(i).get(j);
                if (j == 0) {
                    currMin.add(curr + prevMin.get(j));
                } else if (j == i) {
                    currMin.add(curr + prevMin.get(j - 1));
                } else {
                    currMin.add(Math.min(prevMin.get(j - 1), prevMin.get(j)) + curr);
                }
            }
            prevMin = currMin;
        }
        return Collections.min(prevMin);
    }
}
