import java.util.List;

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int minIdx = -1;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) <= nums.get((i - 1 + nums.size()) % nums.size())) {
                if (minIdx != -1) {
                    return -1;
                }
                minIdx = i;
            }
        }
        return (nums.size() - minIdx) % nums.size();
    }
}
