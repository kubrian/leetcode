class Solution {
    public boolean canAliceWin(int n) {
        boolean isAliceTurn = true;
        int toRemove = 10;
        while (n >= toRemove) {
            n -= toRemove;
            toRemove--;
            isAliceTurn = !isAliceTurn;
        }
        return !isAliceTurn;
    }
}
