import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        return (int) items.stream().filter(item -> item.get(idx).equals(ruleValue)).count();
    }
}
