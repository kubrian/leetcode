import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> res = new ArrayDeque<>();
        Stream.of(path.split("/+")).filter(x -> !x.isEmpty()).forEach(x -> {
            if (x.equals("..")) {
                res.pollLast();
            } else if (!x.equals(".")) {
                res.offerLast(x);
            }
        });
        return res.stream().collect(Collectors.joining("/", "/", ""));
    }
}
