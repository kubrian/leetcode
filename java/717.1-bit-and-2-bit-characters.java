class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        // 1 -> 2 steps
        // 0 -> 1 step
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
}
