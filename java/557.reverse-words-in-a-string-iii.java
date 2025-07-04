import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" ")).map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
