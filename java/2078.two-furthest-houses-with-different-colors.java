class Solution {
    public int maxDistance(int[] colors) {
        int dist = colors.length - 1;
        while (dist > 0) {
            for (int i = 0; i + dist < colors.length; i++) {
                if (colors[i] != colors[i + dist]) {
                    return dist;
                }
            }
            dist--;
        }
        return dist;
    }
}
