class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] need = new int[26];
        for (char c: ransomNote.toCharArray()) {
            need[c - 'a']++;
        }
        for (char c: magazine.toCharArray()) {
            need[c - 'a']--;
        }
        for (int i: need) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
