class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int maxLateConsec = 0;
        int currLateConsec = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                maxLateConsec = Math.max(maxLateConsec, ++currLateConsec);
            } else if (c == 'A') {
                currLateConsec = 0;
                absent++;
            } else {
                currLateConsec = 0;
            }
        }
        return absent < 2 && maxLateConsec < 3;
    }
}
