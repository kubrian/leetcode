class Solution {
    public boolean isFascinating(int n) {
        String s = n + "" + n * 2 + "" + n * 3;
        return s.chars().count() == 9 && s.chars().distinct().filter(c -> c != '0').count() == 9;
    }
}
