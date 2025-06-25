class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        // Is there some math trick?
        int[] res = new int[num_people];
        for (int i = 1; candies > 0; i++) {
            res[(i - 1) % num_people] += Math.min(i, candies);
            candies -= i;
        }
        return res;
    }
}
