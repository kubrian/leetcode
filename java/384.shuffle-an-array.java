import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    int[] original;
    List<Integer> list;

    public Solution(int[] nums) {
        original = Arrays.copyOf(nums, nums.length);
        list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
    }

    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        Collections.shuffle(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}