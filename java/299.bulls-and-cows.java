class Solution {
    public String getHint(String secret, String guess) {
        int exact = 0;
        int spare = 0;
        int[] extras = new int[10]; // Store frequency of extra digits
        for (int i = 0; i < secret.length(); i++) {
            int sCurr = secret.charAt(i) - '0';
            int gCurr = guess.charAt(i) - '0';
            if (sCurr == gCurr) {
                exact++;
            } else {
                // Do we need gCurr?
                if (extras[gCurr] < 0) {
                    spare++;
                }
                // Do we have sCurr?
                if (extras[sCurr] > 0) {
                    spare++;
                }
                extras[sCurr]--; // Need more s
                extras[gCurr]++; // Need less g
            }
        }
        return exact + "A" + spare + "B";
    }
}
