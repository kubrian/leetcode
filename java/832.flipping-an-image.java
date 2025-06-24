class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[0].length + 1) / 2; j++) {
                int left = 1 - image[i][j];
                image[i][j] = 1 - image[i][image[0].length - 1 - j];
                image[i][image[0].length - 1 - j] = left;
            }
        }
        return image;
    }
}
