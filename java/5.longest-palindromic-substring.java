import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String longestPalindrome(String s) {
        // Use Manacher's algorithm

        // Add placeholder '#' in between characters, at the start and end
        s = Arrays.stream(s.split(""))
                .collect(Collectors.joining("#", "#", "#"));

        int[] longest = new int[s.length()]; // Radius of LP excluding center
        int left = -1; // Left end (exclusive) of rightmost palindrome
        int right = 0; // Right end (exclusive) of rightmost palindrome

        for (int i = 0; i < s.length(); i++) {
            // If within current bounds, use previous result
            if (i < right) {
                int distToRight = right - i; // >0
                int mirror = left + distToRight;
                // -1 since the bound should be excluded
                longest[i] = Math.min(distToRight - 1, longest[mirror]);
            }

            // Use trivial algorithm
            int leftCurr = i - longest[i] - 1;
            int rightCurr = i + longest[i] + 1;
            while (leftCurr >= 0 && rightCurr < s.length() &&
                    s.charAt(leftCurr) == s.charAt(rightCurr)) {
                longest[i]++;
                leftCurr--;
                rightCurr++;
            }

            // Update bounds
            if (i + longest[i] + 1 > right) {
                left = i - longest[i] - 1;
                right = i + longest[i] + 1;
            }
        }

        // Find the index with the longest radius
        int maxIndex = IntStream.range(0, longest.length)
                .boxed()
                .max((a, b) -> longest[a] - longest[b])
                .get();
        int maxRadius = longest[maxIndex];

        // Get the original substring
        StringBuilder sb = new StringBuilder();
        for (int i = maxIndex - maxRadius + 1; i <= maxIndex + maxRadius; i += 2) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
