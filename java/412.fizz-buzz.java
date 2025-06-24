import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(i -> {
            String res = "";
            if (i % 3 == 0) {
                res += "Fizz";
            }
            if (i % 5 == 0) {
                res += "Buzz";
            }
            return res.isEmpty() ? String.valueOf(i) : res;
        }).collect(Collectors.toList());
    }
}
