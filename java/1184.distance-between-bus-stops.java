class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        for (int x : distance) {
            total += x;
        }
        int sum = 0;
        for (int i = destination; i != start; i = (i + 1) % distance.length) {
            sum += distance[i];
        }
        return Math.min(total - sum, sum);
    }
}
