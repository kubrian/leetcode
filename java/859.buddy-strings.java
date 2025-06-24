import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        // Diff length
        if (s.length() != goal.length()) {
            return false;
        }
        // Same word, find duplicate char
        if (s.equals(goal)) {
            return s.chars().distinct().count() < s.length();
        }
        // Check only one swap
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
                if (diff.size() > 2) {
                    return false;
                }
            }
        }
        // Bruteforce
        return diff.size() == 2 && s.charAt(diff.get(0)) == goal.charAt(diff.get(1))
                && s.charAt(diff.get(1)) == goal.charAt(diff.get(0));
    }
}
