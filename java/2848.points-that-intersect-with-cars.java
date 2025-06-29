import java.util.List;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] used = new boolean[101];
        for (List<Integer> num : nums) {
            for (int i = num.get(0); i <= num.get(1); i++) {
                used[i] = true;
            }
        }
        int count = 0;
        for (boolean b : used) {
            if (b) {
                count++;
            }
        }
        return count;
    }
}
