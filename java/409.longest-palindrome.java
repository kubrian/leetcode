import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                res += 2;
                seen.remove(c);
            } else {
                seen.add(c);
            }
        }
        return seen.isEmpty() ? res : res + 1;
    }
}
