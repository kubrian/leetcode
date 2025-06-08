import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;

        // Two pointer approach
        int startIndexIncl = 0;
        int endIndexExcl = 0;

        // Store encountered characters
        Set<Character> encountered = new HashSet<>();

        while (endIndexExcl < s.length()) {
            char current = s.charAt(endIndexExcl++);
            while (encountered.contains(current)) {
                encountered.remove(s.charAt(startIndexIncl++));
            }
            encountered.add(current);
            longest = Math.max(longest, endIndexExcl - startIndexIncl);
        }

        return longest;
    }
}
