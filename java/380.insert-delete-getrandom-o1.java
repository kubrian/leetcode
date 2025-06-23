import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {

    Map<Integer, Integer> valToPos;
    List<Integer> nums;
    Random rand;

    public RandomizedSet() {
        valToPos = new HashMap<>();
        nums = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        // Add to the end
        if (valToPos.containsKey(val)) {
            return false;
        } else {
            nums.add(val);
            valToPos.put(val, nums.size() - 1);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!valToPos.containsKey(val)) {
            return false;
        } else {
            int pos = valToPos.get(val);
            // Shift last element to take over pos
            int lastElem = nums.get(nums.size() - 1);
            nums.set(pos, lastElem);
            valToPos.put(lastElem, pos);

            // Remove last & val
            nums.remove(nums.size() - 1);
            valToPos.remove(val);
            return true;
        }
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}
