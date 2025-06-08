import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isSubstringPresent(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        Set<String> subStrings = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            subStrings.add(s.substring(i, i + 2));
        }
        for (int i = 0; i < s.length() - 1; i++) {
            String curr = reversed.substring(i, i + 2);
            if (subStrings.contains(curr)) {
                return true;
            }
        }
        return false;
    }
}
