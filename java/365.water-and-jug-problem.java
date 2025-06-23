class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        return target <= x + y && target % gcd(x, y) == 0;        
    }
    
    private int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
