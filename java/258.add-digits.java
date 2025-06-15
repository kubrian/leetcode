class Solution {
    public int addDigits(int num) {
        // What kind of question is this
        // Consider 2 digit numbers: 10 -> 1, 11 -> 2, ... 18 -> 9, (19 -> 10 -> 1)!, 20 -> 2, ...
        // Whenever a 10 is made, we lose 9 to get 1.
        // Cycle repeats every 9 numbers therefore...
        return num == 0 ? 0 : (num - 1) % 9 + 1; // shift from 0 to 8 to 1 to 9
    }
}
