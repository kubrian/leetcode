import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        char curr = s.charAt(0);
        int start = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != curr) {
                if (i - start >= 3) {
                    List<Integer> currList = new ArrayList<>();
                    currList.add(start);
                    currList.add(i - 1);
                    res.add(currList);
                }
                curr = s.charAt(i);
                start = i;
            }
        }
        if (s.length() - start >= 3) {
            List<Integer> currList = new ArrayList<>();
            currList.add(start);
            currList.add(s.length() - 1);
            res.add(currList);
        }
        return res;
    }
}
