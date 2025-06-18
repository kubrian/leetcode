
import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        // Find the last position of every character
        int[] occurrences = new int[26];
        for (char c : s.toCharArray()) {
            occurrences[c - 'a']++;
        }

        // Characters should be compared from back to front to see if there is any opportunity for
        // improvement
        // Deeper in stack <=> More at the front <=> Compare from top of stack to bottom
        boolean[] usingChar = new boolean[26]; // Instead of doing search
        Stack<Character> res = new Stack<>();

        for (char c : s.toCharArray()) {
            occurrences[c - 'a']--;
            // Skip if already used
            if (usingChar[c - 'a']) {
                continue;
            }

            // Try to improve
            while (!res.empty() && res.peek() > c && occurrences[res.peek() - 'a'] > 0) {
                usingChar[res.pop() - 'a'] = false;
            }

            res.push(c);
            usingChar[c - 'a'] = true;
        }

        // Reverse the string
        StringBuilder sb = new StringBuilder();
        while (!res.empty()) {
            sb.append(res.pop());
        }
        return sb.reverse().toString();

    }
}
