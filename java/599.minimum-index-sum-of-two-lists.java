import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<>();
        int maxSum = 0;
        while (res.isEmpty() && maxSum < list1.length + list2.length - 1) {
            int i = Math.max(0, maxSum - (list2.length - 1));
            int j = maxSum - i;
            while (i < list1.length && j >= 0) {
                if (list1[i].equals(list2[j])) {
                    res.add(list1[i]);
                }
                i++;
                j--;
            }
            maxSum++;
        }
        return res.toArray(new String[0]);
    }
}
