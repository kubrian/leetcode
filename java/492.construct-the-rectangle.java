class Solution {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area); // sqrt rounds down, w is better
        while (area % w != 0) {
            w--;
        }
        return new int[] {area / w, w};
    }
}
