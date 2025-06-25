import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        int[][] count = new int[26][words.length];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                count[c - 'a'][i]++;
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < words.length; j++) {
                min = Math.min(min, count[i][j]);
            }
            for (int j = 0; j < min; j++) {
                res.add(String.valueOf((char) (i + 'a')));
            }
        }
        return res;
    }
}
