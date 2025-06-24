import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        String rows[] = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> res = new ArrayList<>();
        for (String word : words) {
            for (String row : rows) {
                boolean isValid = true;
                for (char c : word.toLowerCase().toCharArray()) {
                    if (!row.contains(String.valueOf(c))) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    res.add(word);
                    break;
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
