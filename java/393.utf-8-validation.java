class Solution {
    public boolean validUtf8(int[] data) {
        int remainining = 0;
        for (int num : data) {
            if (remainining == 0) {
                if ((num >> 5) == 0b110) {
                    remainining = 1;
                } else if ((num >> 4) == 0b1110) {
                    remainining = 2;
                } else if ((num >> 3) == 0b11110) {
                    remainining = 3;
                } else if ((num >> 7) == 0b1) {
                    return false;
                }
            } else {
                if ((num >> 6) != 0b10) {
                    return false;
                }
                remainining--;
            }
        }
        return remainining == 0;
    }
}
