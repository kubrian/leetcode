import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            String lex = s.chars().sorted().collect(StringBuilder::new,
                    StringBuilder::appendCodePoint, StringBuilder::append).toString();
            groups.putIfAbsent(lex, new ArrayList<>());
            groups.get(lex).add(s);
        }

        return groups.values().stream().collect(Collectors.toList());
    }
}
