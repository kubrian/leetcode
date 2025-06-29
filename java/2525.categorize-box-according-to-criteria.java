class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = length >= 1e4 || width >= 1e4 || height >= 1e4
                || (long) length * width * height >= 1e9;
        boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky) {
            return "Bulky";
        } else if (isHeavy) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}
