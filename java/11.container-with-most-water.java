class Solution {
    public int maxArea(int[] height) {
        int i = 0; // Left ref
        int j = height.length - 1; // Right ref
        int max = 0;

        while (i < j) {
            int currH = Math.min(height[i], height[j]);
            int currArea = (j - i) * currH;
            max = Math.max(max, currArea);
            while (i < j && height[i] <= currH) {
                // Move left forward until a larger number is encountered
                i++;
            }
            while (i < j && height[j] <= currH) {
                // Move right backwards similarly.
                j--;
            }
        }
        return max;
    }
}