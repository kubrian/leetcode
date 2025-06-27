class Solution {
    public int secondHighest(String s) {
        return s.chars().filter(Character::isDigit).map(c -> -(c - '0')).distinct().sorted()
                .distinct().limit(2).skip(1).map(c -> -c).findFirst().orElse(-1);
    }
}
