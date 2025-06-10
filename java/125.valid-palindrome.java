import java.util.stream.Collectors;

class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().chars().filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
