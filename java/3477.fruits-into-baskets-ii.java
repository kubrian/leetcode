class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] used = new boolean[baskets.length];
        int res = 0;

        for (int f : fruits) {
            boolean found = false;
            for (int i = 0; i < baskets.length; i++) {
                if (!used[i] && f <= baskets[i]) {
                    used[i] = true;
                    found = true;
                    break;
                }
            }
            if (!found) {
                res++;
            }
        }
        return res;
    }
}
