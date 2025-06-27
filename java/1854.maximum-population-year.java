class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diff = new int[101]; // 1950 to 2050 incl.
        for (int[] log : logs) {
            diff[log[0] - 1950]++;
            diff[log[1] - 1950]--;
        }
        int max = 1950;
        int pop = diff[0];
        int maxPop = diff[0];
        for (int i = 1; i < diff.length; i++) {
            pop += diff[i];
            if (pop > maxPop) {
                max = i + 1950;
                maxPop = pop;
            }
        }
        return max;
    }
}
