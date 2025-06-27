import java.util.Arrays;

class Solution {
    public int numDifferentIntegers(String word) {
        word = word.replaceAll("[a-z]", " ").trim();
        if (word.isEmpty()) {
            return 0;
        }
        return (int) Arrays.stream(word.split("\\s+")).map(s -> s.replaceAll("^0+", "")).distinct()
                .count();
    }
}
