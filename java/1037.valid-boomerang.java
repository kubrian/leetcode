class Solution {
    public boolean isBoomerang(int[][] points) {
        // If the cross product is not 0, the three points are not collinear
        return (points[1][0] - points[0][0])
                * (points[2][1] - points[0][1]) != (points[2][0] - points[0][0])
                        * (points[1][1] - points[0][1]);
    }
}
