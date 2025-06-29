class Solution {
    public boolean hasMatch(String s, String p) {
        int idx = p.indexOf("*");
        int front = s.indexOf(p.substring(0, idx));
        int back = s.indexOf(p.substring(idx + 1), front + p.substring(0, idx).length());
        return front != -1 && back != -1;
    }
}
