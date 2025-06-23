import java.util.Arrays;

class Solution {
    public int firstUniqChar(String s) {
        int NOT_SEEN = s.length();
        int INVALID = -1;
        int[] minPos = new int[26];
        Arrays.fill(minPos, NOT_SEEN);

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int idx = curr - 'a';
            if (minPos[idx] == NOT_SEEN) {
                minPos[idx] = i;
            } else {
                minPos[idx] = INVALID;
            }
        }

        int res = NOT_SEEN;
        for (int pos : minPos) {
            if (pos != INVALID && pos < res) {
                res = pos;
            }
        }

        return res == NOT_SEEN ? -1 : res;
    }
}
