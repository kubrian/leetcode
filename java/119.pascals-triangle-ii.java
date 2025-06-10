import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = List.of(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curr.add(1);
                } else {
                    curr.add(prev.get(j - 1) + prev.get(j));
                }
            }
            prev = curr;
        }
        return prev;
    }
}
