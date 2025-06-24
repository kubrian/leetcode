class Solution {
    public int findLUSlength(String a, String b) {
        // ?? TF. Should be shortest uncommon instead?
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
