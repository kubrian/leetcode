import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            if (freq[i] == 0) {
                continue;
            }
            freq[i]--;
            for (int j = 0; j < 10; j++) {
                if (freq[j] == 0) {
                    continue;
                }
                freq[j]--;
                for (int k = 0; k < 10; k += 2) {
                    if (freq[k] == 0) {
                        continue;
                    }
                    freq[k]--;
                    res.add(i * 100 + j * 10 + k);
                    freq[k]++;
                }
                freq[j]++;
            }
            freq[i]++;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
