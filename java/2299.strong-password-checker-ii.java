class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean basic =
                password.length() >= 8 && password.chars().anyMatch(c -> Character.isLowerCase(c))
                        && password.chars().anyMatch(c -> Character.isUpperCase(c))
                        && password.chars().anyMatch(c -> Character.isDigit(c))
                        && password.chars().anyMatch(c -> "!@#$%^&*()-+".indexOf(c) != -1);
        if (!basic) {
            return false;
        }
        for (int i = 0; i < password.length() - 1; i++) {
            char c1 = password.charAt(i);
            char c2 = password.charAt(i + 1);
            if (c1 == c2) {
                return false;
            }
        }
        return true;
    }
}
