class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if ((i - 1 < 0 || flowerbed[i - 1] == 0)
                    && (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0)) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count >= n;
    }
}
