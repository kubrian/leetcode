class Solution {
    public boolean canWinNim(int n) {
        // Base: 1 to 3 -> auto win
        // 4: remove 1 to 3, opponent has 1-3 anyway.
        // 5-7: remove 1 to 3 to make opponent have 4
        // 8: remove 1 to 3, opponent has 5-7 anyway.
        // ...
        // Yep.
        return n % 4 != 0;
    }
}
