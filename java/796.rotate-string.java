class Solution {
    public boolean rotateString(String s, String goal) {
        // Same length and contained in 2 * s
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
