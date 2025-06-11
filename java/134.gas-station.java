class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currGas = 0;
        int currCost = 0;
        int totalGas = 0;
        int totalCost = 0;
        int start = -1;
        for (int i = 0; i < gas.length; i++) {
            currGas += gas[i];
            currCost += cost[i];
            totalGas += gas[i];
            totalCost += cost[i];
            if (currGas >= currCost) {
                start = start == -1 ? i : start;
            } else {
                currGas = 0;
                currCost = 0;
                start = -1;
            }
        }
        return totalGas < totalCost ? -1 : start;
    }
}
