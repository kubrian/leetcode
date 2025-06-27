class Solution {
    public int countAsterisks(String s) {
        boolean inside = false;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '|') {
                inside = !inside;
            } else if (c == '*' && !inside) {
                count++;
            }
        }
        return count;
    }
}
