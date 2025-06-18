class Solution {
    public int bulbSwitch(int n) {
        // Bulb i is toggled by the number of factors of i
        // It is always an even number (i = a * b, ...), except for i = k^2
        // All non squares will be off, all squares will be on.
        // So, just count the number of squares up to n
        return (int) Math.sqrt(n);
    }
}
